package exercicios;

import java.util.Scanner;

import model.services.ServicoImpressao;

public class ZX_ExercicioGenerics1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ServicoImpressao<Integer> ps = new ServicoImpressao<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();

		Integer x = ps.first();

		System.out.println("First: " + x);

		sc.close();

	}

}
