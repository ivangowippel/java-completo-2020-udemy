package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reserva;
import exceptions.ExcecaoDeDominio;

public class ZI_ExercicioExcecoes4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Quarto número: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Data do check-in (DD/MM/AAAA): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (DD/MM/AAAA): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("Digite os dados para atualizar a reserva: ");
			System.out.print("Data do check-in (DD/MM/AAAA): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (DD/MM/AAAA): ");
			checkOut = sdf.parse(sc.next());
	
			reserva.atualizarDatas(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		} catch (ParseException e) {
			System.out.println("Formato da data inválida!");
		} catch (ExcecaoDeDominio e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}

		sc.close();
	}
}
