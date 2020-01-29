package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ProdutoArquivos;

public class ZP_ExercicioArquivos6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<ProdutoArquivos> lista = new ArrayList<>();
		
		System.out.print("Informe o caminho do arquivo de origem: ");
		String arquivoOrigem = sc.nextLine();
		
		File caminho = new File(arquivoOrigem);
		String pastaOrigem = caminho.getParent();
		
		boolean deuCerto = new File(pastaOrigem + "\\out").mkdir();
		
		String arquivoDestino = pastaOrigem + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivoOrigem))) {
			
			String itemCsv = br.readLine();
			
			while (itemCsv != null) {
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				double valor = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);
				
				lista.add(new ProdutoArquivos(nome, valor, quantidade));
				
				itemCsv = br.readLine();
			}
		
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {
				
				for (ProdutoArquivos produto : lista) {
					bw.write(produto.getNome() + "," + String.format("%.2f", produto.total()));
					bw.newLine();
				}
				
				System.out.println(arquivoOrigem + " Criado com sucesso!");
				
			} catch (IOException e) {
				System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		sc.close();
	}
}
