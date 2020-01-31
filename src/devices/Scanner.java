package devices;

public class Scanner extends Dispositivo {

	public Scanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando o scanner: " + doc);
	}

	public String scan() {
		return "Conteúdo do scanner";
	}
	
}
