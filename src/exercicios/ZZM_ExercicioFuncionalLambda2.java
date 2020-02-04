package exercicios;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto2;

public class ZZM_ExercicioFuncionalLambda2 {

	public static int compareProducts(Produto2 p1, Produto2 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Produto2> list = new ArrayList<>();
		
		list.add(new Produto2("TV", 900.00));
		list.add(new Produto2("Notebook", 1200.00));
		list.add(new Produto2("Tablet", 450.00));
		
		list.sort(ZZM_ExercicioFuncionalLambda2::compareProducts);
		
		list.forEach(System.out::println);
	}

}
