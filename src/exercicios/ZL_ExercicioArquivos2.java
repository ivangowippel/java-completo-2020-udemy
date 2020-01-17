package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZL_ExercicioArquivos2 {

	public static void main(String[] args) {

		String path = "F:\\Ivango\\Cursos Udemy\\Java Completo 2020\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
