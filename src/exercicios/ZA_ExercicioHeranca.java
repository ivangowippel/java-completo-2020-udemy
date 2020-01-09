package exercicios;

import entities.ContaComum;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class ZA_ExercicioHeranca {

	public static void main(String[] args) {
		
		ContaComum comum = new ContaComum(1001, "Alex", 0.0);
		ContaEmpresarial empresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		ContaComum comum1 = empresarial;
		comum1.getSaldo();
		ContaComum comum2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		ContaComum comum3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		ContaEmpresarial comum4 = (ContaEmpresarial)comum2;
		comum4.emprestimo(100.0);
		
		//ContaEmpresarial comum5 = (ContaEmpresarial)comum3;
		if (comum3 instanceof ContaEmpresarial) {
			ContaEmpresarial comum5 = (ContaEmpresarial)comum3;
			comum5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if (comum3 instanceof ContaPoupanca) {
			ContaPoupanca comum5 = (ContaPoupanca)comum3;
			comum5.atualizarSaldo();
			System.out.println("Atualizado!");
		}
		
		// Sobreposição, anotação @Override
		ContaComum acc1 = new ContaComum(1001, "Alex", 1000.0);
		acc1.sacar(200.0);
		System.out.println(acc1.getSaldo());
		
		ContaComum acc2 = new ContaPoupanca(1002, "Bob", 1000.0, 0.01);
		acc2.sacar(200.0);
		System.out.println(acc2.getSaldo());
		
		// palavra super
		ContaComum acc3 = new ContaEmpresarial(1003, "Ana", 1000.0, 500.0);
		acc3.sacar(200.0);
		System.out.println(acc3.getSaldo());
		
	}

}
