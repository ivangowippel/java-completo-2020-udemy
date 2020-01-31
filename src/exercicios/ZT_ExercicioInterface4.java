package exercicios;

import devices.Impressora;
import devices.Scanner;

public class ZT_ExercicioInterface4 {

	public static void main(String[] args) {
		
		Impressora p = new Impressora("1080");
		p.processarDoc("Minha Carta");
		p.imprimir("Minha Carta");
		
		Scanner s = new Scanner("2003");
		s.processarDoc("Meu Email");
		System.out.println("Resultado do scan: " + s.scan());

	}

}
