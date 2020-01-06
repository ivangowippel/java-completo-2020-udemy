package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario1;

public class Q_ExercicioLista2 {

	public static void main(String[] args) {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario1> list = new ArrayList<>();

		// PART 1 - LENDO OS DADOS:

		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario1(id, nome, salario));
		}

		// PART 2 - AUMENTANDO O SALÁRIO DE UM DADO FUNCIONÁRIO:
		
		System.out.println();
		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		Funcionario1 auxiliar = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (auxiliar == null) {
			System.out.println("Este ID não existe!");
		} else {
			System.out.print("Qual o percentual de aumento: ");
			double percentual = sc.nextDouble();
			auxiliar.aumentarSalario(percentual);
		}

		// PART 3 - LISTAGEM DE FUNCIONÁRIOS:
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionario1 funcionario : list) {
			System.out.println(funcionario);
		}
	}

}
