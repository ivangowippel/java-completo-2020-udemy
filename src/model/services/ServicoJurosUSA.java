package model.services;

public class ServicoJurosUSA implements ServicoJuros {

	private double taxaJuros;

	public ServicoJurosUSA(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
	
}
