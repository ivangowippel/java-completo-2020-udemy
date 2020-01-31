package devices;

public class ScannerConcreto extends Dispositivo implements Scanner {

	public ScannerConcreto(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando o scanner: " + doc);
	}

	@Override
	public String scan() {
		return "Conteúdo do scanner";
	}
	
}
