package exercicios;

import java.util.Scanner;

import entities.Aluno;

public class J_ExercicioAluno {

	public static void main(String[] args) {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota3: ");
		aluno.nota3 = sc.nextDouble();

		System.out.println();
		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

		if (aluno.notaFinal() > 60) {
			System.out.println("APROVADO");
		} else {
			System.out.printf("FALTARAM %.2f PONTOS%n", aluno.pontosFaltantes());
		}

		sc.close();
	}

}
