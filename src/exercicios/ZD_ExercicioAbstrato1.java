package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.Figura;
import entities.Retangulo1;
import entities.enums.Cor;

public class ZD_ExercicioAbstrato1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Figura> lista = new ArrayList<>();

		System.out.print("Entre com o número de figuras: ");
		int qtde = sc.nextInt();

		for (int i = 1; i <= qtde; i++) {
			System.out.println("Dados da figura #" + i + ":");
			System.out.print("Circulo ou Retangulo (c/r)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Cor (AZUL/PRETO/VERMELHO): ");
			Cor cor = Cor.valueOf(sc.next());
			if (resposta == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo1(cor, altura, largura));
			} else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}

		System.out.println();
		System.out.println("AREA DAS FIGURAS:");
		for (Figura figura : lista) {
			System.out.println(String.format("%.2f", figura.area()));
		}

		sc.close();
	}

}
