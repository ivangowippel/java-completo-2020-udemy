package devices;

public class ComboDispositivo extends Dispositivo implements Scanner, Impressora {

	public ComboDispositivo(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo o combo: " + doc);
	}

	@Override
	public String scan() {
		return "Resultado do combo scan";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando o combo: " + doc);
	}

}
