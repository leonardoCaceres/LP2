package br.imd.ufrn.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.imd.ufrn.dominio.Paciente;
import br.imd.ufrn.dominio.Enfermeira;
import br.imd.ufrn.dominio.Medico;

public class HospitalVisao {
	static Scanner sc = new Scanner(System.in);
	
	public static void medicoVision(Medico medico, ArrayList<Paciente> pacientes) {
		System.out.println("Escolha uma ação:");
		System.out.println("1.Consultar paciente");
		System.out.println("2.Adicionar paciente");
		System.out.println("3.Requisição de exames");
		
		int acao;
		acao = sc.nextInt();
		if(acao == 1) {
			System.out.println("Escolha uma ação:");
			System.out.println("1.Consultar paciente");
			System.out.println("2.Adicionar paciente");
			System.out.println("3.Requisição de exames");
			System.out.println(medico.getSenha());
			//int tipoDeBusca;
			//tipoDeBusca = sc.nextInt();
			//for(Paciente paciente : pacientes) {
			
			//}
		}
		else if(acao == 2) {
			
		}
	}
	
	public static void enfermeiraVision(Enfermeira enfermeira, ArrayList<Paciente> pacientes) {
		System.out.println("Escolha uma ação:");
		System.out.println("1.Consultar paciente");
		System.out.println("2.");
		System.out.println("3.Médico");
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>();
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o menu:");
		System.out.println("1.Paciente");
		System.out.println("2.Enfermeira");
		System.out.println("3.Médico");

		int entrada = -1;
		entrada = sc.nextInt();
		
		if(entrada == 1) {
			Paciente pacienteZero = new Paciente();
			System.out.println(pacienteZero);
		}
		else if(entrada == 2) {
			
		}
		else if(entrada == 3) {
			System.out.println("Menu do médico:");
			System.out.println("1.Entrar");
			System.out.println("2.Cadastrar");
			entrada = sc.nextInt();
			
			if(entrada == 1) {
				int login;
				String senha;
				
				System.out.println("Login:");
				login = sc.nextInt();
				System.out.println("Senha");
				senha = sc.next();
				
				for(Medico medico: medicos) {
					if(medico.getSenha() == senha && medico.getLogin() == login) {
						medicoVision(medico, pacientes);
					}
				}
			}
			else if(entrada == 2) {
				//Medico
				medicos.add(null);
			}
			else {
				System.out.println("Entrada Inválida");
			}
		}
		else {
			System.out.println("Entrada Inválida");
		}
		
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
