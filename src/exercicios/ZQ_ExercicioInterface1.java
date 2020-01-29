package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.TaxaServicoBrasil;

public class ZQ_ExercicioInterface1 {

	public static void main(String[] args) throws ParseException {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Digite os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (DD/MM/YYYY hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Devolução (DD/MM/YYYY hh:ss): ");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarro ac = new AluguelCarro(inicio, fim, new Veiculo(modelo));
		
		System.out.print("Digite o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Digite o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorDia, precoPorHora, new TaxaServicoBrasil());
		
		servicoAluguel.processarFatura(ac);
		
		System.out.println("FATURA");
		System.out.println("Pagamento básico: " + String.format("%.2f", ac.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", ac.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getPagamentoTotal()));
		
		sc.close();
	}

}
