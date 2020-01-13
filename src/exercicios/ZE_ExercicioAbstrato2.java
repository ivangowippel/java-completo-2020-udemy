package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ZE_ExercicioAbstrato2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int qtde = sc.nextInt();
		
		for (int i=1; i<=qtde; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Fisica ou Juridica (f/j)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (resposta == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionario = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		double total=0;
		for (Contribuinte contribuinte : lista) {
			System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f", contribuinte.imposto()));
			total += contribuinte.imposto();
		}
		
		System.out.println();
		System.out.println("TOTAL DOS IMPOSTOS: R$ " + String.format("%.2f", total));
		
		sc.close();
	}

}
