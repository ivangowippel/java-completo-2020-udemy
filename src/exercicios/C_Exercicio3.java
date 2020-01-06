package exercicios;

import java.util.Scanner;

public class C_Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o preço: ");
		double preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Valor da conta = R$ %.2f %n", desconto);
		
		sc.close();	
	}

}
