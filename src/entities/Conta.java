package entities;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		depositar(depositoInicial);
	}
	
	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
		
	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor + 5.00;
	}

	public String toString() {
		return "Conta " 
				+ numero 
				+ ", Correntista: " 
				+ nome 
				+ ", Saldo: R$ " 
				+ String.format("%.2f", saldo);
	}
}
