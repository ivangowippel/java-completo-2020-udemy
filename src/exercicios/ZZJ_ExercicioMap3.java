package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ZZJ_ExercicioMap3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> eleicao = new LinkedHashMap<>();
		
		System.out.print("Digite o caminho completo do arquivo: ");
		String arquivo = sc.nextLine();
				
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				String nome = campos[0];
				int votoAtual = Integer.parseInt(campos[1]);
				
				if (eleicao.containsKey(nome)) {
					int votacaoAnterior = eleicao.get(nome);
					eleicao.put(nome, votoAtual + votacaoAnterior);
				} else {
					eleicao.put(nome, votoAtual);
				}
				
				linha = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		for (String nome : eleicao.keySet()) {
			System.out.println(nome + ": " + eleicao.get(nome));
		}
				
		sc.close();
	}

}
