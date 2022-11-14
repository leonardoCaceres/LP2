package br.imd.ufrn.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Pessoa{
	int CRM;
	String especialidade;
	
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
	
	public Medico() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o login:");
		this.login = sc.nextInt();
		System.out.println("Escolha a senha:");
		this.senha = sc.nextInt();
		
		sc.close();
	}
}
