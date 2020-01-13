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
		
		System.out.print("Quarto número: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Data do check-in (DD/MM/AAAA): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data do check-out (DD/MM/AAAA): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: a data do check-out deve ser posterior à data do check-in");
		} else {
			Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("Digite os dados para atualizar a reserva: ");
			System.out.print("Data do check-in (DD/MM/AAAA): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (DD/MM/AAAA): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva: as datas da reserva para atualização devem ser futuras");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva: a data do check-out deve ser posterior à data do check-in");
			} else {
				reserva.atualizarDatas(checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
			}
		}

		sc.close();
	}

}
