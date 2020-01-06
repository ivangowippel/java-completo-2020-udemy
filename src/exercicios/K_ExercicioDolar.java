package exercicios;

import java.util.Scanner;

import util.ConversorDeMoeda;

public class K_ExercicioDolar {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do dolar: ");
		double cotacao = sc.nextDouble();
		System.out.print("Valor de dolares a ser comprados: ");
		double valor = sc.nextDouble();
		
		System.out.printf("Total a ser pago em reais = R$ %.2f%n", ConversorDeMoeda.dolarParaReal(cotacao, valor));
		
		sc.close();
	}

}
