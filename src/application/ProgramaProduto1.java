package application;

import java.util.Scanner;

import entities.Produto1;

public class ProgramaProduto1 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto1 produto = new Produto1();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser adicionado no estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionaProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser removido do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto);
		
		
		sc.close();
	}

}
