package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Z_ExemploMarcelo {

	public static void main(String[] args) {
		String inputDoUsuario = "08/1998";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
		LocalDate mesAnoLocalDate = LocalDate.parse(inputDoUsuario, formatter);

		System.out.println("Mês: " + mesAnoLocalDate.getDayOfMonth());
		System.out.println("Ano: " + mesAnoLocalDate.getYear());
	}

}
