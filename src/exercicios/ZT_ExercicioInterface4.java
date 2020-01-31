package exercicios;

import devices.ComboDispositivo;
import devices.ImpressoraConcreta;
import devices.ScannerConcreto;

public class ZT_ExercicioInterface4 {

	public static void main(String[] args) {
		
		ImpressoraConcreta p = new ImpressoraConcreta("1080");
		p.processarDoc("Minha Carta");
		p.imprimir("Minha Carta");
		
		System.out.println();
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processarDoc("Meu Email");
		System.out.println("Resultado do scan: " + s.scan());
		
		System.out.println();
		ComboDispositivo combo = new ComboDispositivo("2081");
		combo.processarDoc("Minha disserta��o");
		combo.imprimir("Minha disserta��o");
		System.out.println("Resultado do scan: " + combo.scan());

	}

}
