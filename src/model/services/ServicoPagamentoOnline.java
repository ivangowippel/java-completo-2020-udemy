package model.services;

public interface ServicoPagamentoOnline {

	double juros(double quantia, int meses);
	double taxaPagamento(double quantia);
	
}
