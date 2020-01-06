package exercicios;

import java.util.Scanner;

import entities.Conta;

public class L_ExercicioConta {

	public static void main(String[] args) {
				
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Nome do correntista: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Será efetuado um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.print("Informe o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}
				
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Atualização da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("Atualização da conta:");
		System.out.println(conta);
		
		sc.close();
	}

}
