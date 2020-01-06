package util;

public class ConversorDeMoeda {

	public static double IOF = 0.06;

	public static double dolarParaReal(double cotacao, double valor) {
		return cotacao * valor * (1.0 + IOF);
	}

}
