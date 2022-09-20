package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import br.ufrn.imd.dominio.Aluno;
import br.ufrn.imd.dominio.Curso;
import br.ufrn.imd.dominio.Disciplina;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		List<Curso> listaDeCursos = new ArrayList<Curso>();
		int escolha = -1;
		
		try {
			while(true) {
				System.out.println("Ecolha uma opção:\n"
						+ "1. Cadastrar aluno\n"
						+ "2. Acessar aluno\n"
						+ "3. Remover aluno\n"
						+ "0. Sair");
				escolha = sc.nextInt();
				sc.nextLine();
				
				if(escolha == 1) {
					System.out.println("Digite o nome do aluno");
					String nome = sc.nextLine();
					System.out.println("Digite a matricula do aluno");
					String matricula = sc.nextLine();
					System.out.println("Digite o curso do aluno");
					Curso curso = new Curso(sc.nextLine());
					Aluno aluno = new Aluno(nome, matricula, curso);
					listaDeCursos.add(curso);
					listaDeAlunos.add(aluno);
				}
				else if(escolha == 2) {
					System.out.println("Digite o nome do aluno");
					String nome = sc.nextLine();
					Iterator<Aluno> it = listaDeAlunos.iterator();
					while(it.hasNext()) {
						Aluno aluno = it.next();
						if(aluno.getNome().equals(nome)) {
							System.out.println("Ecolha uma opção:\n"
									+ "1. Matricular aluno\n"
									+ "2. Trancar disciplina\n"
									+ "3. Trancar o semestre\n"
									+ "0. Sair");
							escolha = sc.nextInt();
							sc.nextLine();
						}
					}
				}
				else if(escolha == 3) {
					
				}
				else if(escolha == 0) {
					break;
				}
			}
		}
		finally {
			
		}
		/*
		Aluno jose = new Aluno();
		jose.setNome("José da Silva");
		jose.setMatricula("20229393939");
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 19);
		dataNascimento.set(Calendar.MONTH, 06);
		dataNascimento.set(Calendar.YEAR, 1988);
		jose.setDataNascimento(dataNascimento.getTime());
		
		Curso bti = new Curso();
		bti.setDescricao("Bacharelado em Tecnologia da Informação");
		
		jose.setCurso(bti);
		
		Disciplina imd0040 = new Disciplina();
		imd0040.setId(1);
		imd0040.setCurso(bti);
		imd0040.setDescricao("Linguagens de programação II");
		
		jose.solicitarMatricula(imd0040);
		jose.setIra(9.6);
		
		Disciplina imd0404 = new Disciplina();
		imd0404.setId(2);
		imd0404.setCurso(bti);
		imd0404.setDescricao("Web I");
		
		jose.solicitarMatricula(imd0404);
		
		System.out.println(jose);
		
		
		for (Disciplina d : jose.listarDisciplinas()) {
			System.out.println(d);
		}
		
		Disciplina imd0404c = new Disciplina();
		imd0404c.setId(2);
		imd0404c.setCurso(bti);
		imd0404c.setDescricao("Web I");
		
		jose.trancarMatricula(imd0404c);
		
		for (Disciplina d : jose.listarDisciplinas()) {
			System.out.println(d);
		}
		
		//inserção interativa desses itens 
		//regras de negócio - implementação dos métodos de solicitar matrícula
		*/
	}

}