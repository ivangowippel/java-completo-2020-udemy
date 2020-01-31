package devices;

public abstract class Dispositivo {

	public String serialNumber;

	public Dispositivo(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public abstract void processarDoc(String doc);
	
}