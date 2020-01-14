package entities;

import exceptions.ExcecaoDeSaque;

public class ContaBancaria {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaBancaria() {
	}

	public ContaBancaria(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
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

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor > limiteSaque) {
			throw new ExcecaoDeSaque("O valor excede o limite para saque!");
		}
		if (valor > saldo) {
			throw new ExcecaoDeSaque("Saldo insuficiente!");
		}
		saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "Novo saldo: R$ " + String.format("%.2f", saldo);
	}
	
}
