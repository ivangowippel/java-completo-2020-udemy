package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reserva;

public class ZI_ExercicioExcecoes4 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Quarto n�mero: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Data do check-in (DD/MM/AAAA): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data do check-out (DD/MM/AAAA): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: a data do check-out deve ser posterior � data do check-in");
		} else {
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("Digite os dados para atualizar a reserva: ");
			System.out.print("Data do check-in (DD/MM/AAAA): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (DD/MM/AAAA): ");
			checkOut = sdf.parse(sc.next());

			String erro = reserva.atualizarDatas(checkIn, checkOut);
			if (erro != null) {
				System.out.println("Erro na reserva: " + erro);
			} else {
				System.out.println("Reserva: " + reserva);
			}
		}
		
		sc.close();
	}
	
}
