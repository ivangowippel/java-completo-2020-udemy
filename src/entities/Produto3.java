package entities;

public class Produto3 {

	//encapsulamento (variáveis tipo private e criar os getters e setters
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor padrão
	public Produto3() {
	}
	
	//construtor1
	public Produto3(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//construtor2
	public Produto3(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
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
