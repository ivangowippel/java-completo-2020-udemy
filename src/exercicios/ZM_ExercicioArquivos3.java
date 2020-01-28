package exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ZM_ExercicioArquivos3 {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Bom dia!", "Boa tarde!", "Boa noite!" };
		String path = "F:\\Ivango\\Cursos Udemy\\Java Completo 2020\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
