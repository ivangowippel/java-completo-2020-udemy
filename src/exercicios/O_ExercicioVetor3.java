package exercicios;

import java.util.Scanner;

import entities.Aluguel;

public class O_ExercicioVetor3 {

	public static void main(String[] args) {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vetor = new Aluguel[10];

		System.out.print("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i < n + 1; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
			System.out.println();
		}

		System.out.println("Quartos ocupados:");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();
	}

}
