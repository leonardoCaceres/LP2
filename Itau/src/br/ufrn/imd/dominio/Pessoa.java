package br.ufrn.imd.dominio;

public class Pessoa {
	private String nome;
	private int cpf;
	private String endereco;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nome, int cpf, String endereco) {
		this.nome = nome;
		this.cpf= cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return nome + " - CPF: " + cpf;
	}
}
