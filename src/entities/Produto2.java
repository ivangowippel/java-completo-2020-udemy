package entities;

public class Produto2 {

	public String nome;
	public double preco;
	public int quantidade;
	
	//construtor padrão
	public Produto2() {
	}
	
	//construtor1
	public Produto2(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//construtor2
	public Produto2(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double valorTotalNoEstoque() {
		return quantidade * preco;
	}
	
	public void adicionaProdutos(int quantidade) {
		this.quantidade += quantidade;
		
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$ "
			+ String.format("%.2f", valorTotalNoEstoque());
	}
}
