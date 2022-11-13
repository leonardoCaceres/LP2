package br.imd.ufrn.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Pessoa{
	private String endereco;
	private double numeroSUS;
	private ArrayList<String> remedio = new ArrayList<String>();
	private Historico historicoDoPaciente;
	
	public void setCPF(double cpf) {
		this.cpf = cpf;
	}
	public double getCPF() {
		return this.cpf;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getTelefone() {
		return this.telefone;
	}
	public void setNome(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getdDataNascimento() {
		return this.dataNascimento;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSenha() {
		return senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getNumeroSUS() {
		return numeroSUS;
	}
	public void setNumeroSUS(double numeroSUS) {
		this.numeroSUS = numeroSUS;
	}
	public ArrayList<String> getRemedio() {
		return remedio;
	}
	public void setRemedio(ArrayList<String> remedio) {
		this.remedio = remedio;
	}
	public Historico getHistoricoDoPaciente() {
		return historicoDoPaciente;
	}
	public void setHistoricoDoPaciente(Historico historicoDoPaciente) {
		this.historicoDoPaciente = historicoDoPaciente;
	}

	public String toString() {
		return "Hey";
	}
}
