package application;

import java.util.Scanner;

import entities.Produto2;

public class ProgramaProduto2 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto2 p = new Produto2();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		Double preco = sc.nextDouble();
		
		Produto2 produto2 = new Produto2(nome, preco);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto2);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser adicionado no estoque: ");
		int quantidade = sc.nextInt();
		produto2.adicionaProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto2);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser removido do estoque: ");
		quantidade = sc.nextInt();
		produto2.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto2);
		
		
		sc.close();
	}

}
