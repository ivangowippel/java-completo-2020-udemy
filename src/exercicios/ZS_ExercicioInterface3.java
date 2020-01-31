package exercicios;

import model.entities.Circulo;
import model.entities.FiguraAbstrata;
import model.entities.Retangulo;
import model.entities.enums.Cor;

public class ZS_ExercicioInterface3 {

	public static void main(String[] args) {
		
		FiguraAbstrata s1 = new Circulo(Cor.PRETO, 2.0);
		FiguraAbstrata s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);
	
		System.out.println("Circle color: " + s1.getCor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getCor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
	}

}
