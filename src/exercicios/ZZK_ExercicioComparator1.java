package exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Produto2;

public class ZZK_ExercicioComparator1 {

	public static void main(String[] args) {

		List<Produto2> list = new ArrayList<>();
		
		list.add(new Produto2("TV", 900.0));
		list.add(new Produto2("Notebook", 1200.0));
		list.add(new Produto2("Tablet", 450.0));
		
		Comparator<Produto2> comp = new Comparator<Produto2>() {
			@Override
			public int compare(Produto2 p1, Produto2 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		list.sort(comp);
		
		for (Produto2 p : list) {
			System.out.println(p);
		}

	}

}
