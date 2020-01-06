package exercicios;

import java.util.Scanner;

public class E_Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = 4;

		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - FIM");
		System.out.println();
		System.out.print("Informe o tipo de combustivel: ");
		tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			}else if (tipo == 3) {
				diesel += 3;
			} else {
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Alcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - FIM");
			System.out.println();
			System.out.print("Informe o tipo de combustivel: ");
			tipo = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
	
}
