package br.imd.ufrn.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.imd.ufrn.dominio.Paciente;
import br.imd.ufrn.dominio.Enfermeira;
import br.imd.ufrn.dominio.Medico;

public class HospitalVisao {
	static Scanner sc = new Scanner(System.in);

	public static Paciente buscaPacientePorCPF(ArrayList<Paciente> pacientes, String CPF) {
		for(Paciente paciente : pacientes) {
			if( CPF.equals(paciente.getCPF()) ){
				return paciente;
			}
		}
		return null;
	}
	
	public static Paciente buscaPaciente(ArrayList<Paciente> pacientes) {
		int tipoDeBusca;
		System.out.println("--------------------------------------------------------");
		System.out.println("Escolha uma forma de busca:");
		System.out.println("1.Consultar pelo nome");
		System.out.println("2.Consultar pelo cpf");
		System.out.println("3.Consultar pelo numero do SUS");
		System.out.println("4.Voltar");
		System.out.println("--------------------------------------------------------");
		tipoDeBusca = sc.nextInt();

		if(tipoDeBusca >= 1 && tipoDeBusca <= 3) {
			if(pacientes.size() == 0) {
				System.out.println("Não há pacientes cadastrados!");
				return null;
			}
			for(Paciente paciente : pacientes) {
				if(tipoDeBusca == 1) {
					if( sc.next().equals(paciente.getNome()) ){
						return paciente;
					}
				}
				else if(tipoDeBusca == 2) {
					if( sc.next().equals(paciente.getCPF()) ){
						return paciente;
					}
				}
				else if(tipoDeBusca == 3) {
					if(sc.nextDouble() == paciente.getNumeroSUS()){
						return paciente;
					}
				}
			}
			return null;
		}
		else if(tipoDeBusca == 4) {
			return null;
		}
		else {
			System.out.println("Comando não encontrado tente novamente!");
		}
		return null;
	}
	
	public static void medicoVision(Medico medico, ArrayList<Paciente> pacientes) {
		int acao = -1;
		while(acao != 4) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Olá, seja bem vindo ao Sistema Hospitalar Online (SHO).");
			System.out.println("Escolha uma ação:");
			System.out.println("1.Consultar paciente");
			System.out.println("2.Adicionar paciente");
			System.out.println("3.Requisição de exames");
			System.out.println("4.Sair");
			System.out.println("--------------------------------------------------------");
			
			acao = sc.nextInt();
			if(acao == 1) {
				Paciente paciente = buscaPaciente(pacientes);
				
				if(paciente != null) {
					System.out.println(paciente.dadosImportantes());
				}
				else {
					System.out.println("Paciente não encontrado!");
				}
			}
			else if(acao == 2) {
				
				for(Paciente paciente : pacientes) {
					if( sc.nextDouble() == paciente.getNumeroSUS()){
						
					}else {
						pacientes.add(paciente);
					}
				}
			}
			else if(acao == 3) {
							
			}
			else if(acao == 4) {
				
			}
		}
	}
	
	public static void enfermeiraVision(Enfermeira enfermeira, ArrayList<Paciente> pacientes) {
		System.out.println("|--------------------------------------------------------|");
		System.out.println("Escolha uma ação:");
		System.out.println("1.Cadastrar paciente");
		System.out.println("2.Modificar atributos do paciente");
		System.out.println("3.Médico");
		System.out.println("|--------------------------------------------------------|");
	}
	
	public static void pacienteVision(ArrayList<Paciente> pacientes) {
		boolean continuar = true;
		String acao = "nothing";
		
		while(continuar) {
			System.out.println("Olá, o usuário já é cadastrado(a)? Digite 'S'(Sim) ou 'N'(Não)");
			System.out.println("Responda 'Sair' para sair");
			acao = sc.next();
			if(acao.equals("N")||acao.equals("n")||acao.equals("Nao")||acao.equals("nao")) {
				boolean realizarCadastro = false;
				String cadastro = "nothing";
				while(!realizarCadastro) {
					System.out.println("Gostaria de realizar o cadastro? Digite 'S'(Sim) ou 'N'(Não)");
					cadastro = sc.next();
					if(cadastro.equals("S")||cadastro.equals("s")||cadastro.equals("Sim")||cadastro.equals("sim")) {
						System.out.println("Vamos realizar o cadastro!");
						Paciente novoPaciente = new Paciente();
						pacientes.add(novoPaciente);
						System.out.println("Usuario de CPF: " + novoPaciente.getCPF() +
								" foi cadastrado!\n");
						System.out.println("Voltando ao menu!\n");
						realizarCadastro = true;
					}
					else if(cadastro.equals("N")||cadastro.equals("n")||cadastro.equals("Nao")||cadastro.equals("nao")) {
						realizarCadastro = true;
					}
					else {
						System.out.println("Verifique a entrada digitada!");
					}
				}
			}
			else if(acao.equals("S")||acao.equals("s")||acao.equals("Sim")||acao.equals("sim")) {
				String escolha = "nothing";
				while(!escolha.equals("N")) {
					System.out.println("Digite o seu CPF:");
					Paciente paciente = buscaPacientePorCPF(pacientes, sc.next());
					if(paciente == null) {
						String novaEscolha = "nothing";
						while(!novaEscolha.equals("S") && !novaEscolha.equals("N")) {
							System.out.println("Usuário não encontrado!"
									+ "\n" + "Gostaria de tentar novamente?\n");
							System.out.println("Digite 'S'(Sim) ou 'N'(Não)");
							novaEscolha = sc.next();
							if(novaEscolha.equals("N")||novaEscolha.equals("n")||novaEscolha.equals("nao")||novaEscolha.equals("Nao")) {
								escolha = "N";
								break;
							}
							else if(novaEscolha.equals("S")||novaEscolha.equals("S")||novaEscolha.equals("Sim")||novaEscolha.equals("sim")){
								break;
							}
							else {
								System.out.println("Verifique a entrada digitada!");
								System.out.println("Tente Novamente\n");
							}
						}
					}
					else if(paciente != null){
						int motivo = -1;
						while(motivo != 4) {
							System.out.println("|--------------------------------------------------------|");
							System.out.println("Olá sr(a)"+ paciente.getNome() +", qual o motivo da sua visita?");
							System.out.println("1.Retirar exames");
							System.out.println("2.Nova consulta");
							System.out.println("3.Finalização do tratamento");
							System.out.println("4.Sair");
							System.out.println("|--------------------------------------------------------|");
							motivo = sc.nextInt();
							if(motivo == 1) {
								System.out.println(paciente.getExames());
							}
							else if(motivo == 2){
								
							}
							else if(motivo == 3) {
								
							}
							else if(motivo == 4) {
								System.out.println("Retornando ao menu!\n");
								escolha = "N";
								break;
							}
							else {
								System.out.println("Verifique a entrada digitada!");
								System.out.println("Tente Novamente");
							}
						}
					}
				}
			}
			else if(acao.equals("Sair") || acao.equals("sair") ) {
				continuar = false;
				System.out.println("Retornando ao menu principal!\n");
			}
			else {
				System.out.println("Verifique a entrada digitada!");
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>();

		int entrada = -1;
		while(entrada != 4) {
			System.out.println("|--------------------------------------------------------|");
			System.out.println("Escolha o menu:");
			System.out.println("1.Paciente");
			System.out.println("2.Enfermeira");
			System.out.println("3.Médico");
			System.out.println("4.Sair");
			System.out.println("|--------------------------------------------------------|");

			entrada = sc.nextInt();
			if(entrada == 1) {
				pacienteVision(pacientes);
				System.out.println(pacientes);
			}
			else if(entrada == 2) {
				System.out.println("|--------------------------------------------------------|");
				System.out.println("Menu de enfermeiro:");
				System.out.println("1.Entrar");
				System.out.println("2.Cadastrar");
				System.out.println("|--------------------------------------------------------|");
				entrada = sc.nextInt();
				
				if(entrada == 1) {
					int login, senha;
					boolean entrou = false;
					System.out.println("Login:");
					login = sc.nextInt();
					System.out.println("Senha");
					senha = sc.nextInt();
					
					for(Enfermeira enfermeira: enfermeiras) {
						if(enfermeira.getSenha() == senha && enfermeira.getLogin() == login) {
							entrou = true;
							EnfermeiraVision(enfermeira, pacientes);
						}
					}
					if(!entrou) {
						System.out.println("Combinação de senha e Login apresentados não encontrada!\n");
					}
				}else if(entrada == 2) {
					Enfermeira enf = new Enfermeira();
	 				enfermeiras.add(enf);
				}else {
					System.out.println("Entrada Inválida");
				}
			}
			else if(entrada == 3) {
				System.out.println("|--------------------------------------------------------|");
				System.out.println("Menu do médico:");
				System.out.println("1.Entrar");
				System.out.println("2.Cadastrar");
				System.out.println("|--------------------------------------------------------|");
				entrada = sc.nextInt();
				
				if(entrada == 1) {
					int login, senha;
					boolean entrou = false;
					System.out.println("Login:");
					login = sc.nextInt();
					System.out.println("Senha");
					senha = sc.nextInt();
					
					for(Medico medico: medicos) {
						if(medico.getSenha() == senha && medico.getLogin() == login) {
							entrou = true;
							medicoVision(medico, pacientes);
						}
					}
					if(!entrou) {
						System.out.println("Combinação de senha e Login apresentados não encontrada!\n");
					}
				}
				else if(entrada == 2) {
					Medico med = new Medico();
	 				medicos.add(med);
				}
				else {
					System.out.println("Entrada Inválida");
				}
			}
			else if(entrada != 4){
				System.out.println("Entrada Inválida");
			}
		}
		System.out.println("Fim do programa!");
		sc.close();
	}
}
/*
try {
	double cpfDeEntrada;
	String senhaDeEntrada;
	
	System.out.println("Digite o CPF");
	cpfDeEntrada = sc.nextDouble();
	System.out.println("Digite o SENHA");
	senhaDeEntrada = sc.next();
}
//catch {
	
//}
finally {
	
}
*/

//Paciente pacienteZero = new Paciente();
//System.out.println(pacienteZero);
