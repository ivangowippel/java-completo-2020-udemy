package exercicios;

import java.util.Scanner;

import model.services.ServicoJuros;
import model.services.ServicoJurosBrasil;

public class ZV_ExercicioInterface6 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();

		ServicoJuros is = new ServicoJurosBrasil(2.0);
		double pagamento = is.pagamento(quantia, meses);
		System.out.println("Pagamento após " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));

		sc.close();
	}

}
