package br.imd.ufrn.dominio;

import java.util.Scanner;

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
	public Enfermeira() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o login:");
		this.login = sc.nextInt();
		System.out.println("Escolha a senha:");
		this.senha = sc.nextInt();
		
		//sc.close();
	}
}
