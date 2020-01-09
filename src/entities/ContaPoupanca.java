package entities;

public class ContaPoupanca extends ContaComum {

	private double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, double saldo, double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
}
