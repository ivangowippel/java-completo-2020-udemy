package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date dataPedido;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Date dataPedido, StatusPedido status, Cliente cliente) {
		this.dataPedido = dataPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void adicionarItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0;
		for (ItemPedido item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data do pedido: ");
		sb.append(sdf.format(dataPedido) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
