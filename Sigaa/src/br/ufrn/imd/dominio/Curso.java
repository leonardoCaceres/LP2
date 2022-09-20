package br.ufrn.imd.dominio;

/**
 * Classe que representa o curso que pode ser, por exemplo: BTI, ECT.
 * @author itami
 *
 */
public class Curso {

	private int id;
	private String descricao;
	private String nome;

	public Curso()
	{
		
	}
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public Curso(int id, String descricao, String nome) {
		this.id = id;
		this.descricao = descricao;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "nome " + nome + ", id " + id + " descricao: " + descricao;
	}
}