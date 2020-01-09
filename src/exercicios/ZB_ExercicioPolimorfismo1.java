package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class ZB_ExercicioPolimorfismo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Empregado> lista = new ArrayList<>();

		System.out.print("Entre com o número de empregados: ");
		int qtde = sc.nextInt();

		for (int i = 1; i <= qtde; i++) {
			System.out.println("Empregado #" + i + ":");
			System.out.print("Terceirizado (y/n)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();			
			
			if (resposta == 'y') {
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				lista.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, despesaAdicional));
			} else {
				lista.add(new Empregado(nome, horas, valorPorHora));
			}
			
		}	
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Empregado emp : lista) {
			System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
		}

		sc.close();
	}

}
