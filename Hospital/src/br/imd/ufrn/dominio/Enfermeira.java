package br.imd.ufrn.dominio;

public class Enfermeira extends Pessoa{
	int COREN;
	
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
	
	public Enfermeira(String nome, int COREN, int login, int senha) {
		this.nome = nome;
		this.COREN = COREN;
		this.login = login;
		this.senha = senha;
	}
}
