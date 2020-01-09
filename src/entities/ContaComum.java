package entities;

public class ContaComum {

	private Integer numero;
	private String titular;
	protected double saldo;
	
	public ContaComum() {
	}

	public ContaComum(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
}
