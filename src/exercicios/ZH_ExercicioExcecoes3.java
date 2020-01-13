package exercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ZH_ExercicioExcecoes3 {

	public static void main(String[] args) {
		
		File file = new File("F:\\Ivango\\Cursos Udemy\\Java Completo 2020\\in.txt");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco finally executado!");
		}

	}

}
