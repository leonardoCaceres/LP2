package br.ufrn.imd.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
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
		
		Random random = new Random();
		
		try {
			while(true) {
				System.out.println("Ecolha uma opção:\n"
						+ "1. Cadastrar aluno\n"
						+ "2. Acessar aluno\n"
						+ "3. Remover aluno\n"
						+ "4. Adicionar curso\n"
						+ "5. Adicionar disciplina ao curso\n"
						+ "6. Remover disciplina do curso\n"
						+ "7. Remover curso\n"
						+ "0. Sair");
				escolha = sc.nextInt();
				sc.nextLine();
				
				//Cadastrar aluno
				if(escolha == 1) {
					System.out.println("Digite o nome do aluno");
					String nome = sc.nextLine();
					System.out.println("Digite a matricula do aluno");
					String matricula = sc.nextLine();
					System.out.println("Digite o curso do aluno");
					String curso = sc.nextLine();
					Iterator<Curso> itCursos = listaDeCursos.iterator();
					boolean cursoEncontrado = false; 
					while(itCursos.hasNext()) {
						Curso encontrarCurso = itCursos.next();
						if(encontrarCurso.getNome().equals(curso)) {
							Aluno aluno = new Aluno(nome, matricula, encontrarCurso);
							listaDeAlunos.add(aluno);
							System.out.println("O aluno " + aluno.getNome()
									+ " de matricula " + aluno.getMatricula()
									+ " do curso " + (aluno.getCurso()).getNome() 
									+ " foi cadastrado!");
							break;
						}
					}
					if(!cursoEncontrado) {
						System.out.println("Nenhum curso com o nome de "
								+ curso + " foi encontrado!\n"
								+ "Verifique o nome e tente novamente!");
					}
				}
				//Acessar aluno
				else if(escolha == 2) {
					System.out.println("Digite a matricula do aluno");
					String matricula = sc.nextLine();
					Iterator<Aluno> it = listaDeAlunos.iterator();
					while(it.hasNext()) {
						Aluno aluno = it.next();
						int escolhaDentroDeAluno = -1;
						if(aluno.getMatricula().equals(matricula)) {
							System.out.println("O aluno de nome "
									+ aluno.getNome() + " foi encontrado");
							System.out.println("Ecolha uma opção para o aluno:\n"
									+ "1. Trocar de curso\n"
									+ "2. Matricular aluno\n"
									+ "3. Trancar disciplina\n"
									+ "4. Trancar o semestre\n"
									+ "0. Sair");
							escolhaDentroDeAluno = sc.nextInt();
							sc.nextLine();
							//Modificar o curso (trocar de curso*)
							if(escolhaDentroDeAluno == 1){
								System.out.println("Digite o novo curso do aluno");
								String curso = sc.nextLine();
								Iterator<Curso> itCursos = listaDeCursos.iterator();
								boolean cursoEncontrado = false; 
								while(itCursos.hasNext()) {
									Curso encontrarCurso = itCursos.next();
									if(encontrarCurso.getNome().equals(curso) && !(aluno.getCurso()).getNome().equals(curso) ) {
										aluno.setCurso(encontrarCurso);
										int numeroRandomico = random.nextInt(1000000);
										String novaMatricula = "2020" + String.valueOf(numeroRandomico);
										aluno.setMatricula(novaMatricula);
										cursoEncontrado = true;
										break;
									}
								}
								if(!cursoEncontrado) {
									System.out.println("Nenhum curso com o nome de "
											+ curso + " foi encontrado!\n"
											+ "Verifique o nome e tente novamente!");
								}
							}
							if(escolhaDentroDeAluno == 0){
								System.out.println("Retornando ao menu!");
								break;
							}
						}
						else{
							System.out.println("Nenhum aluno com a matricula "
									+ matricula + " foi encontrado!\n"
									+ "Verifique a matricula e tente novamente!");
						}
					}
				}
				//Remover aluno
				else if(escolha == 3) {
					System.out.println("Digite a matricula do aluno");
					String matricula = sc.nextLine();
					Iterator<Aluno> it = listaDeAlunos.iterator();
					boolean alunoEncontrado = false; 
					while(it.hasNext()) {
						Aluno aluno = it.next();
						if(aluno.getMatricula().equals(matricula)) {
							System.out.println("O aluno de nome "
									+ aluno.getNome() + " e matricula "
									+ aluno.getMatricula() + " foi "
									+ "encontrado! E sera removido!");
							it.remove();
							alunoEncontrado = true;
							break;
						}
					}
					if(!alunoEncontrado){
						System.out.println("Nenhum aluno com a matricula "
								+ matricula + " foi encontrado!\n"
								+ "Verifique a matricula e tente novamente!");
					}
				}
				else if(escolha == 4) {
					System.out.println("Digite o nome do curso");
					String curso = sc.nextLine();
					System.out.println("Digite a id do curso");
					int id = sc.nextInt();
					sc.nextLine();
					Iterator<Curso> itCursos = listaDeCursos.iterator();
					boolean cursoEncontrado = false; 
					while(itCursos.hasNext()) {
						Curso encontrarCurso = itCursos.next();
						if(encontrarCurso.getNome().equals(curso) && encontrarCurso.getId() != id) {
							if(encontrarCurso.getNome().equals(curso)) {
								System.out.println("Ja existe um curso com esse nome,"
										+ " altere-o afim de criar um novo curso!");
							}
							else
							{
								System.out.println("Ja existe um curso com essa id,"
										+ " altere-a afim de criar um novo curso!");
							}
							break;
						}
					}
					if(!cursoEncontrado) {
						System.out.println("Escreva a descricao do curso");
						String descricaoDoCurso = sc.nextLine();
						Curso novoCurso = new Curso(id, descricaoDoCurso, curso);
						listaDeCursos.add(novoCurso);
						System.out.println("Curso criado: " + novoCurso);
					}
				}
				else if(escolha == 0) {
					System.out.println("Saindo do programa volte sempre :)");
					break;
				}
			}
		}
		finally {
			
		}
	}
}