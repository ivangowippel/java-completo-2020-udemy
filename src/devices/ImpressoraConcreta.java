package devices;

public class ImpressoraConcreta extends Dispositivo implements Impressora {

	public ImpressoraConcreta(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando a impressora: " + doc);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
