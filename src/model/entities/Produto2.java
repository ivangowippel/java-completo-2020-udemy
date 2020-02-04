package model.entities;

public class Produto2 {

	private String name;
	private Double price;

	public Produto2(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Produto2 [name=" + name + ", price=" + price + "]";
	}
	
}
