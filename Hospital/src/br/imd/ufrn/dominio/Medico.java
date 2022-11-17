package br.imd.ufrn.dominio;

public class Medico extends Pessoa{
	protected int CRM;
	protected String especialidade;
	
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
	
	public Medico(String nome, int crm, String especialidade, int login, int senha) {
		this.nome = nome;
		this.CRM = crm;
		this.especialidade = especialidade;
		this.login = login;
		this.senha = senha;
	}
}
