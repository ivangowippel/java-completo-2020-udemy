package application;

import java.util.Scanner;

import entities.Produto3;

public class ProgramaProduto3 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		Double preco = sc.nextDouble();
		
		Produto3 produto3 = new Produto3(nome, preco);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto3);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser adicionado no estoque: ");
		int quantidade = sc.nextInt();
		produto3.adicionaProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto3);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser removido do estoque: ");
		quantidade = sc.nextInt();
		produto3.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto3);
		
		
		sc.close();
	}

}
