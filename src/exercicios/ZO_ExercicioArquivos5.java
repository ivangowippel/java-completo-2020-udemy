package exercicios;

import java.io.File;
import java.util.Scanner;

public class ZO_ExercicioArquivos5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		System.out.println("getName: " + caminho.getName());
		System.out.println("getParent: " + caminho.getParent());
		System.out.println("getPath: " + caminho.getPath());
		
		sc.close();
	}
}
