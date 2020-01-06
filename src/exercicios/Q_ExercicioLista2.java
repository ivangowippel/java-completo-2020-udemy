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

		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			System.out.println();
			System.out.println("Funcion�rio #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario1(id, nome, salario));
		}

		// PART 2 - AUMENTANDO O SAL�RIO DE UM DADO FUNCION�RIO:
		
		System.out.println();
		System.out.print("Informe o ID do funcion�rio que ter� aumento salarial: ");
		int id = sc.nextInt();
		Funcionario1 auxiliar = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (auxiliar == null) {
			System.out.println("Este ID n�o existe!");
		} else {
			System.out.print("Qual o percentual de aumento: ");
			double percentual = sc.nextDouble();
			auxiliar.aumentarSalario(percentual);
		}

		// PART 3 - LISTAGEM DE FUNCION�RIOS:
		
		System.out.println();
		System.out.println("Lista de funcion�rios:");
		for (Funcionario1 funcionario : list) {
			System.out.println(funcionario);
		}
	}

}
