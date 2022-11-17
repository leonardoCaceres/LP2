package br.imd.ufrn.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Pessoa{
	protected int CRM;
	protected String especialidade;
	
	private ArrayList<Paciente> pacientesAcompanhados = new ArrayList<Paciente>();
	
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int crm) {
		CRM = crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public ArrayList<Paciente> getPacientesAcompanhados() {
		return pacientesAcompanhados;
	}
	public void setPacientesAcompanhados(ArrayList<Paciente> pacientesAcompanhados) {
		this.pacientesAcompanhados = pacientesAcompanhados;
	}
	
	public Medico(String nome, int crm, String especialidade, int login, int senha) {
		this.nome = nome;
		this.CRM = crm;
		this.especialidade = especialidade;
		this.login = login;
		this.senha = senha;
	}
}
