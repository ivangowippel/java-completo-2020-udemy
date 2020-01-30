package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processarContrato(Contrato contrato, int meses) {
		double valorParcela = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			Date dataVencimento = adicionarMes(contrato.getData(), i);
			double valorJuros = valorParcela + servicoPagamentoOnline.juros(valorParcela, i);
			double valorTotal = valorJuros + servicoPagamentoOnline.taxaPagamento(valorJuros);
			contrato.adicionarParcela(new Parcela(dataVencimento, valorTotal));
		}			 
	}		
		
	private Date adicionarMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}		
	
}
