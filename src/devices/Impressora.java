package devices;

public class Impressora extends Dispositivo {

	public Impressora(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando a impressora: " + doc);
	}

	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
