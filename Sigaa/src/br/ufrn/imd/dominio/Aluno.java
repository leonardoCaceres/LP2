package br.ufrn.imd.dominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	private String matricula;
	private Curso curso;
	private double ira;
	private List<Disciplina> disciplinas;
	
	public Aluno() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public Aluno(String nome, String matricula, Curso curso) {
		disciplinas = new ArrayList<Disciplina>();
		setNome(nome);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	
	@Override
	public String toString() {
		return getNome() + " matrícula: " +matricula;
	}
	
	public void solicitarMatricula(Disciplina disciplina) {
		//verificar se a disciplina já existe na coleção
		if(!disciplinas.contains(disciplina))
			disciplinas.add(disciplina);
	}

	
	public void trancarMatricula(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}
	
	public List<Disciplina> listarDisciplinas() {
		List<Disciplina> disciplinasRetornadas = new ArrayList<Disciplina>();
		disciplinasRetornadas.addAll(disciplinas);
		return disciplinasRetornadas;
	}
	
	public int qtdDisciplinas( ) {
		return disciplinas.size();
	}
}
