package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelDoTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelDoTrabalhador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelDoTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double Renda(Integer mes, Integer ano) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoPorHora c : contratos) {
			cal.setTime(c.getData());
			int c_mes = 1 + cal.get(Calendar.MONTH);
			int c_ano = cal.get(Calendar.YEAR);
			if (c_mes == mes && c_ano == ano) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
