package model.entities;

import model.entities.enums.Cor;

public abstract class Figura {

	private Cor cor;

	public Figura(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	
}
