package exercicios;

import java.util.Scanner;

public class B_Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe os minutos: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos>100) {
			conta += (minutos -100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f %n", conta);
		
		sc.close();
	}
}
