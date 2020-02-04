package exercicios;

import java.util.HashMap;
import java.util.Map;

import model.entities.Product2;

public class ZZI_ExercicioMap2 {

	public static void main(String[] args) {

		Map<Product2, Double> stock = new HashMap<>();
		
		Product2 p1 = new Product2("Tv", 900.0);
		Product2 p2 = new Product2("Notebook", 1200.0);
		Product2 p3 = new Product2("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product2 ps = new Product2("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
