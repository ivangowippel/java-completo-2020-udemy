package model.services;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double JURO_MENSAL = 0.01;
	private static final double TAXA_PAGAMENTO = 0.02;
	
	@Override
	public double juros(double quantia, int meses) {
		return quantia * JURO_MENSAL * meses;
	}
	
	@Override
	public double taxaPagamento(double quantia) {
		return quantia * TAXA_PAGAMENTO;
	}
	
}
