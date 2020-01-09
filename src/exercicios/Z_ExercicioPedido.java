package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto4;
import entities.enums.StatusPedido;

public class Z_ExercicioPedido {

	public static void main(String[] args) throws ParseException {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY: ");
		Date dataNascimento = sdf1.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens tem o pedido: ");
		int qtdeItens = sc.nextInt();
		
		for (int i = 1; i <= qtdeItens; i++) {
			System.out.println("Entre com os dados do item #" + i + ":");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			
			Produto4 produto = new Produto4(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItemPedido itensPedido = new ItemPedido(quantidade, precoProduto, produto);
			pedido.adicionarItem(itensPedido);
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println(pedido);
		
		sc.close();
	}

}
