package entities;

public class Produto1 {

	public String nome;
	public double preco;
	public int quantidade;
	
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
