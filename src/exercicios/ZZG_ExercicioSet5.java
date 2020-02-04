package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZZG_ExercicioSet5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.print("Quantos alunos para o curso 'A'? ");
		int n = sc.nextInt();
		for (int i = 1 ; i <= n; i++) {
			int codAluno = sc.nextInt();
			cursoA.add(codAluno);
		}
		
		System.out.print("Quantos alunos para o curso 'B'? ");
		n = sc.nextInt();
		for (int i = 1 ; i <= n; i++) {
			int codAluno = sc.nextInt();
			cursoB.add(codAluno);
		}

		System.out.print("Quantos alunos para o curso 'C'? ");
		n = sc.nextInt();
		for (int i = 1 ; i <= n; i++) {
			int codAluno = sc.nextInt();
			cursoC.add(codAluno);
		}
		
		Set<Integer> total = new HashSet<>(cursoA);
		total.addAll(cursoB);
		total.addAll(cursoC);
		
		System.out.println("Total de alunos: " + total.size());
		
		sc.close();
	}

}
