package exercicios;

import java.io.File;
import java.util.Scanner;

public class ZN_ExercicioArquivos4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta: ");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("PASTAS:");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}

		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("ARQUIVOS:");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean deuCerto = new File(strCaminho + "\\subdiretorio").mkdir();
		System.out.println("Diretório criado com sucesso: " + deuCerto);
		
		sc.close();
	}
}
