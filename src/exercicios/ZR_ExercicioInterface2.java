package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.ServicoContrato;
import model.services.ServicoPaypal;

public class ZR_ExercicioInterface2 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Digite o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
		
		servicoContrato.processarContrato(contrato, parcelas);
		
		System.out.println();
		System.out.println("PARCELAS:");
		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}
	
}
