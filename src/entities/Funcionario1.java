package entities;

public class Funcionario1 {

	private int id;
	private String nome;
	private double salario;

	public Funcionario1(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentarSalario(double percentual) {
		salario += salario * percentual / 100;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
