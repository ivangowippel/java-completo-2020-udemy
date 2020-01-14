package exceptions;

public class ExcecaoDeSaque extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ExcecaoDeSaque (String msg) {
		super (msg);
	}
}
