package entities;

public class ContaEmpresarial extends ContaComum {

	private double limiteCredito;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, double saldo, double limiteCredito) {
		super(numero, titular, saldo);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void emprestimo(double valor) {
		if (valor <= limiteCredito) {
			saldo += valor -10.0;
		}
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		saldo -= 2.0;
	}
	
}
