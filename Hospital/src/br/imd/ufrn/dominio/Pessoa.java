package br.imd.ufrn.dominio;

import java.time.LocalDate;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected double telefone;
	protected int login;
	protected int senha;
	protected LocalDate dataNascimento;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public boolean logar(int loginDigitada, int senhaDigitada){
		if(login == loginDigitada && senha == senhaDigitada) {
			return true;
		}
		return false;
	}
}
