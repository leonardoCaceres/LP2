package br.ufrn.imd.dominio;

import java.sql.Date;

public class ProdutoNaoDuravel extends Produto {
	private Date dateValidade;
	private String genero;
	
	public ProdutoNaoDuravel() {
		
	}
	
	public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, Date dateValidade, String genero) {
		setNome(nome);
		setPreco(preco);
		setMarca(marca);
		setDescricao(descricao);
		setDataFabricacao(dataFabricacao);
		this.dateValidade = dateValidade;
		this.genero = genero;
	}
	
	public Date getDateValidade() {
		return dateValidade;
	}
	public void setDateValidade(Date dateValidade) {
		this.dateValidade = dateValidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
