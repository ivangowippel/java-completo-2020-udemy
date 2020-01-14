package exercicios;

import java.util.Scanner;

import entities.ContaBancaria;
import exceptions.ExcecaoDeSaque;

public class ZJ_ExercicioExcecoes5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite os dados da conta");
			System.out.print("Número: ");
			int numero = sc.nextInt();
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			sc.nextLine();
			System.out.print("Saldo inicial (R$): ");
			double saldo = sc.nextDouble();
			System.out.print("Limite para saque (R$): ");
			double limiteSaque = sc.nextDouble();
			
			ContaBancaria conta = new ContaBancaria(numero, titular, saldo, limiteSaque);
			
			System.out.println();
			System.out.print("Digite o valor do saque (R$): ");
			double saque = sc.nextDouble();
			conta.sacar(saque);
			System.out.println(conta);
		} catch (ExcecaoDeSaque e) {
			System.out.println("Error no saque: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();
	}

}
