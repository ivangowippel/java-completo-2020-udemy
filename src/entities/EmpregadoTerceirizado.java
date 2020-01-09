package entities;

public class EmpregadoTerceirizado extends Empregado {

	private Double despesaAdicional;	

	public EmpregadoTerceirizado() {
		super();
	}

	public EmpregadoTerceirizado(String nome, Integer horas, double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.10;
	}	
	
}
