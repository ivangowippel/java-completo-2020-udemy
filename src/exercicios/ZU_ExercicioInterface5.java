package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class ZU_ExercicioInterface5 {

	public static void main(String[] args) {

		List<Funcionario> lista = new ArrayList<>();
		String path = "F:\\Ivango\\Cursos Udemy\\Java Completo 2020\\Funcionario.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] campos = funcionarioCsv.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(lista);
			for (Funcionario funcionario : lista) {
				System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
