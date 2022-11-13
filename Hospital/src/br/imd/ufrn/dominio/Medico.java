package br.imd.ufrn.dominio;

import java.util.ArrayList;

public class Medico extends Pessoa{
	int CRM;
	String especialidade;
	private int login;
	private String senha;
	
	private ArrayList<Paciente> pacientesAcompanhados = new ArrayList<Paciente>();
	
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		CRM = cRM;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Paciente> getPacientesAcompanhados() {
		return pacientesAcompanhados;
	}
	public void setPacientesAcompanhados(ArrayList<Paciente> pacientesAcompanhados) {
		this.pacientesAcompanhados = pacientesAcompanhados;
	}
	
	public Medico() {
		
	}
}
