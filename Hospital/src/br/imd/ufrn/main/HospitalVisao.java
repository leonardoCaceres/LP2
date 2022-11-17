package br.imd.ufrn.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.imd.ufrn.dominio.Paciente;
import br.imd.ufrn.dominio.Enfermeira;
import br.imd.ufrn.dominio.Historico;
import br.imd.ufrn.dominio.Medico;

public class HospitalVisao {
	static Scanner sc = new Scanner(System.in);
	
	//modificar a prioridade com auxilio do tempo
	public static Paciente buscaPacientePorPrioridade(ArrayList<Paciente> pacientes, String prioridade) {
		for(Paciente paciente : pacientes)  {
			if( prioridade.equals(paciente.getCPF()) ){
				return paciente;
			}
		}
		return null;
	}
	
	public static Paciente buscaPacientePorCPF(ArrayList<Paciente> pacientes, String CPF) {
		for(Paciente paciente : pacientes) {
			if( CPF.equals(paciente.getCPF()) ){
				return paciente;
			}
		}
		return null;
	}
	
	public static String retornePrioridades(ArrayList<Paciente> pacientes){
		ArrayList<Integer> vetorDePrioridades = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0));
		for(Paciente paciente : pacientes) {
			if ("azul".equals(paciente.getCPF())) {
				vetorDePrioridades.set(0, vetorDePrioridades.get(0)+1);
			}
			else if ("verde".equals(paciente.getCPF())) {
				vetorDePrioridades.set(1, vetorDePrioridades.get(1)+1);
			}
			else if ("amarelo".equals(paciente.getCPF())) {
				vetorDePrioridades.set(2, vetorDePrioridades.get(2)+1);
			}
			else if( "vermelho".equals(paciente.getCPF()) ){
				vetorDePrioridades.set(3, vetorDePrioridades.get(3)+1);
			}
		}
		int cont = 0;
		String saida = "Número de pacientes por prioridade", saidaVazia = saida;
		for(Integer cor : vetorDePrioridades) {
			if(cor != 0) {
				if(cont == 0) {
					saida += " Azul: " + cor;
				}
				else if(cont == 1) {
					saida += " Verde: " + cor;
				}
				else if(cont == 2) {
					saida += " Amarelo: " + cor;
				}
				else if(cont == 3) {
					saida += " Vermelho: " + cor;
				}
			}
			cont++;
		}
		if(saida == saidaVazia) {
			return "Nenhum paciente";
		}
		else {
			return saida;
		}
	}
	
	public static Paciente buscaPaciente(ArrayList<Paciente> pacientes) {
		int tipoDeBusca;
		System.out.println("--------------------------------------------------------");
		System.out.println("Escolha uma forma de busca:");
		System.out.println("1.Consultar pelo nome");
		System.out.println("2.Consultar pelo cpf");
		System.out.println("3.Consultar pela prioridade");
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
				}else if(tipoDeBusca == 2) {
					if( sc.next().equals(paciente.getCPF()) ){
						return paciente;
					}
				}else if(tipoDeBusca == 3) {
					if( sc.next().equals(paciente.getPrioridade()) ){
						return paciente;
					}
				}
			}
			return null;
		}else if(tipoDeBusca == 4) {
			return null;
		}else {
			System.out.println("Comando não encontrado tente novamente!");
		}
		return null;
	}
	
	public static Medico criarMedico(int login) {
		System.out.println("Digite a sua senha:");
		int senha = sc.nextInt();
		System.out.println("Digite o nome do médico:");
		String nome = sc.next();
		System.out.println("Digite o CRM do médico:");
		int CRM = sc.nextInt();
		System.out.println("Digite a especialidade do médico:");
		String especialidade = sc.next();
		Medico med = new Medico(nome, CRM, especialidade, login, senha);
		return med;
	}
	
	public static void medicoVision(Medico medico, ArrayList<Paciente> pacientes) {
		int acao = -1;
		while(acao != 4) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Olá, Dr(a)." + medico.getNome() +  " bem vindo ao Sistema Hospitalar Online (SHO).");
			System.out.println("Escolha uma ação:");
			System.out.println("1.Consultar paciente");
			System.out.println("2.Atender paciente");
			System.out.println("3.Requisição de exames");
			System.out.println("4.Sair");
			System.out.println();
			System.out.println("--------------------------------------------------------");
			
			acao = sc.nextInt();
			if(acao == 1) {
				Paciente paciente = buscaPaciente(pacientes);
				
				if(paciente != null) {
					System.out.println(paciente.dadosImportantes()+"\nHistórico: "+
							"\nDoencas: "+paciente.getHistoricoDoPaciente().getDoencas()+
							"\nAlergias: "+paciente.getHistoricoDoPaciente().getAlergias()+
							"\nCirurgias: "+paciente.getHistoricoDoPaciente().getCirurgias());
				}else {
					System.out.println("Paciente não encontrado!");
				}
			}
			else if(acao == 2) {	
				//for(Paciente paciente : pacientes) {
				Paciente paciente = buscaPaciente(pacientes);
				if( paciente != null && !paciente.getPrioridade().equals("")){
					ArrayList<String> remedios = new ArrayList<String>();
					for(String remedio: remedios) {
						remedios.add(sc.next());
					}
					paciente.setRemedio(remedios);
					paciente.setPrioridade("");
					//pacientes.remove(paciente);
				}
				else if( !paciente.getPrioridade().equals("")){
					System.out.println("Paciente ainda não passou pelo enfermeiro!");
				}
				else {
					continue;
				}
			}else if(acao == 3) {
				for(Paciente paciente : pacientes) {
					//if( sc.nextDouble() == paciente.getNumeroSUS()){
					//	System.out.println("Exames de "+ paciente.getNome()+ ": \n"+paciente.getExames());
					//}
				}
			}else if(acao == 4) {
				break;
			}
		}
	}
	
	public static ArrayList<String> cores = new ArrayList<>(Arrays.asList("azul", "amarelo", "verde", "vermelho"));
	
	public static Enfermeira criarEnfermeira(int login) {
		System.out.println("Digite a sua senha:");
		int senha = sc.nextInt();
		System.out.println("Digite o nome da enfermeira:");
		String nome = sc.next();
		System.out.println("Digite o COREN da enfermeira:");
		int COREN = sc.nextInt();
		Enfermeira enf = new Enfermeira(nome, COREN, login, senha);
		return enf;
	}
	
	public static void enfermeiraVision(Enfermeira enfermeira, ArrayList<Paciente> pacientes) {
		boolean continua = true;
		while(continua) {
			System.out.println("|--------------------------------------------------------|");
			System.out.println("Escolha uma ação:");
			System.out.println("1.Atender paciente");
			System.out.println("2.Cadastrar histórico de um paciente");
			System.out.println("3.Sair");
			System.out.println("|--------------------------------------------------------|");
			int acao = sc.nextInt();
			if(acao == 1) {
				Paciente novoPaciente = buscaPaciente(pacientes);
				if(novoPaciente != null) {
					System.out.println("Informe os sintomas do paciente: ");
					novoPaciente.setSintomas(sc.next());
					System.out.println("Digite qual a prioridade do paciente: ");
					String cor = sc.next();
					if( cores.contains(cor) ) {
						//Arrays.asList(cores).contains(cor);
						if(cor.equals("azul")) {
							novoPaciente.setPrioridade("azul");
						}
						else if(cor.equals("verde")) {
							novoPaciente.setPrioridade("verde");
						}
						else if(cor.equals("amarelo")) {
							novoPaciente.setPrioridade("amarelo");
						}
						else if(cor.equals("vermelho")) {
							novoPaciente.setPrioridade("vermelho");
						}
						else {
							System.out.println("Prioridade INVÁLIDA");
						}
					}
				}
				else {
					System.out.println("Paciente não encontrado!");
				}
			}
			else if(acao == 2) {
				Paciente novoPaciente = buscaPaciente(pacientes);
				if(novoPaciente != null) {
					System.out.println("Preencha o histórico de doenças:");
					ArrayList<String> doencas = new ArrayList<String>();
					ArrayList<String> alergias = new ArrayList<String>();
					ArrayList<String> cirurgias = new ArrayList<String>();
					String entrada = "nothing";
					Historico hist = novoPaciente.getHistoricoDoPaciente();
					doencas = novoPaciente.getHistoricoDoPaciente().getDoencas();
					while(!"finalizar".equals(entrada)) {
						System.out.println("Digite as doenças conhecidas uma por vez!");
						System.out.println("Digite 'finalizar' para sair!");
						entrada = sc.next();
						if(!"finalizar".equals(entrada)) {
							doencas.add(entrada);
						}
					}
					entrada = "nothing";
					while(!"finalizar".equals(entrada)) {
						System.out.println("Digite as alerigas conhecidas uma por vez!");
						System.out.println("Digite 'finalizar' para sair!");
						entrada = sc.next();
						if(!"finalizar".equals(entrada)) {
							alergias.add(entrada);
						}
					}
					entrada = "nothing";
					while(!"finalizar".equals(entrada)) {
						System.out.println("Digite as cirurgias já realizadas uma por vez!");
						System.out.println("Digite 'finalizar' para sair!");
						entrada = sc.next();
						if(!"finalizar".equals(entrada)) {
							cirurgias.add(entrada);
						}
					}
					hist.setDoencas(doencas);
					hist.setAlergias(alergias);
					hist.setCirurgias(cirurgias);
					novoPaciente.setHistoricoDoPaciente(hist);
				}
			}
			else if(acao == 3) {
				break;	
			}
			else {
				System.out.println("Verifique a entrada digitada!");
			}
		}
	}
	
	public static Paciente criarPaciente() {
		System.out.println("Nome:");
		String nome = sc.next();
		System.out.println("CPF:");
		String cpf = sc.next();
		System.out.println("Sexo:");
		String sexo = sc.next();
		return new Paciente(nome, cpf, sexo);
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
						Paciente novoPaciente = criarPaciente();
						pacientes.add(novoPaciente);
						System.out.println("Usuario de CPF: " + novoPaciente.getCPF() +
								" foi cadastrado!\n");
						System.out.println("Voltando ao menu!\n");
						realizarCadastro = true;
					}else if(cadastro.equals("N")||cadastro.equals("n")||cadastro.equals("Nao")||cadastro.equals("nao")) {
						realizarCadastro = true;
					}else {
						System.out.println("Verifique a entrada digitada!");
					}
				}
			}else if(acao.equals("S")||acao.equals("s")||acao.equals("Sim")||acao.equals("sim")) {
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
							}else if(novaEscolha.equals("S")||novaEscolha.equals("s")||novaEscolha.equals("Sim")||novaEscolha.equals("sim")){
								break;
							}else {
								System.out.println("Verifique a entrada digitada!");
								System.out.println("Tente Novamente\n");
							}
						}
					}else if(paciente != null){
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
								if( paciente.getExames().size() == 0) {
									System.out.println("Paciente não tem exames!");
								}
								else {
									for(String exame : paciente.getExames() ) {
										System.out.println(exame);
									}
								}
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
			}else if(acao.equals("Sair") || acao.equals("sair") ) {
				continuar = false;
				System.out.println("Retornando ao menu principal!\n");
			}else {
				System.out.println("Verifique a entrada digitada!");
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>();
		ArrayList<Integer> logins = new ArrayList<Integer>();

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
			}
			else if(entrada == 2) {
				boolean continuar = true;
				while(continuar) {
					System.out.println("|--------------------------------------------------------|");
					System.out.println("Menu de enfermeiro:");
					System.out.println("1.Entrar");
					System.out.println("2.Cadastrar");
					System.out.println("3.Sair");
					System.out.println("|--------------------------------------------------------|");
					int entradaEnf = sc.nextInt();
					
					if(entradaEnf == 1) {
						int login, senha;
						boolean entrou = false;
						System.out.println("Login:");
						login = sc.nextInt();
						System.out.println("Senha");
						senha = sc.nextInt();
						
						for(Enfermeira enfermeira: enfermeiras) {
							if(enfermeira.getSenha() == senha && enfermeira.getLogin() == login) {
								entrou = true;
								enfermeiraVision(enfermeira, pacientes);
							}
						}
						if(!entrou) {
							System.out.println("Combinação de senha e Login apresentados não encontrada!\n");
						}
					}
					else if(entradaEnf == 2) {
						System.out.println("Crie o login:");
						int login = sc.nextInt();
						if( !logins.contains(login) ) {
							enfermeiras.add(criarEnfermeira(login));
							logins.add(login);
						}
						else {
							System.out.println("Login já utilizado!");
						}	
					}
					else if(entradaEnf == 3) {
						continuar = false;
					}
					else {
						System.out.println("Entrada Inválida");
					}
				}
			}
			else if(entrada == 3) {
				boolean continuar = true;
				int acao = -1;
				while(continuar) {
					System.out.println("|--------------------------------------------------------|");
					System.out.println("Menu do médico:");
					System.out.println("1.Entrar");
					System.out.println("2.Cadastrar");
					System.out.println("3.Sair");
					System.out.println("|--------------------------------------------------------|");
					acao = sc.nextInt();
					
					if(acao == 1) {
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
					else if(acao == 2) {
						System.out.println("Crie o login:");
						int login = sc.nextInt();
						if( !logins.contains(login) ) {
							medicos.add(criarMedico(login));
							logins.add(login);
						}
						else {
							System.out.println("Login já utilizado!");
						}
					}
					else if(acao == 3) {
						continuar = false;
					}
					else {
						System.out.println("Entrada Inválida");
					}
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