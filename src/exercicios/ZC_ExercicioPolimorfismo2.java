package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class ZC_ExercicioPolimorfismo2 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int qtde =sc.nextInt();
		
		for (int i=1; i<=qtde; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if (resposta == 'c') {
				lista.add(new Produto(nome, preco));
			} else if (resposta == 'u') {
				System.out.print("Data da fabricação (DD/MM/YYYY: ");
				Date dataFabricacao = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
			} else {
				System.out.print("Taxa de alfândega: ");
				double taxaAlfandega = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DOS PREÇOS:");
		for (Produto produto : lista) {
			System.out.println(produto.etiquetaDePreco());
		}
		
		sc.close();
	}

}
