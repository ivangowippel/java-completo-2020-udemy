package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelDoTrabalhador;

public class X_ExercicioTrabalhador {

	public static void main(String[] args) throws ParseException {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos o trabalhador tem? ");
		int qtdeContratos = sc.nextInt();
		
		for (int i = 1; i <= qtdeContratos; i++) {
			System.out.println("Entre com os dados do contrato #" + i + ":");
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora R$: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, horas);
			trabalhador.adicionarContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular a renda (MM/AAAA): ");
		String mes_ano = sc.next();
		int mes = Integer.parseInt(mes_ano.substring(0, 2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.print("Renda para " + mes_ano + ": " + String.format("%.2f", trabalhador.Renda(mes, ano)));

		sc.close();
	}
}
