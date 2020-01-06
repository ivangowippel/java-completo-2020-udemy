package exercicios;

import java.util.Scanner;

import entities.Produto4;

public class N_ExercicioVetor2 {

	public static void main(String[] args) {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produto4[] vetor = new Produto4[n];

		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto4(nome, preco);
		}

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma/vetor.length;

		System.out.printf("Média do preço: %.2f%n", media);
		
		sc.close();
	}

}
