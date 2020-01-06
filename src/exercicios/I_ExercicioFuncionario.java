package exercicios;

import java.util.Scanner;

import entities.Funcionario;

public class I_ExercicioFuncionario {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + funcionario);
		
		System.out.println();
		System.out.print("Qual o percentual de aumento salarial: ");
		double percentual = sc.nextDouble();
		funcionario.aumentarSalario(percentual);
		
		System.out.println();
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
	}

}
