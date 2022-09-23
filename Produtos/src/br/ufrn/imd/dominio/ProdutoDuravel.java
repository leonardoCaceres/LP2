package br.ufrn.imd.dominio;

import java.sql.Date;

public class ProdutoDuravel extends Produto {
	private int durabilidade;

	public ProdutoDuravel() {
		
	}
	
	public ProdutoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, int durabilidade) {
		setNome(nome);
		setPreco(preco);
		setMarca(marca);
		setDescricao(descricao);
		setDataFabricacao(dataFabricacao);
		setDurabilidade(durabilidade);
	}
	
	public ProdutoDuravel(int durabilidade) {
		super();
		this.durabilidade = durabilidade;
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
}
