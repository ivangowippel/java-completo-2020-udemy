package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ZZN_ExercicioPredicate1 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 550.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
