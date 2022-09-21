package br.ufrn.imd.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha = -1;
		
		try {
			while(true) {
				System.out.println("Ecolha uma opção:\n"
						+ "1. Cadastrar cliente\n"
						+ "2. Cadastrar agencia\n"
						+ "0. Sair");
				
				escolha = sc.nextInt();
				sc.nextLine();
				//Cadastrar cliente
				if(escolha == 1) {
					System.out.println("Digite o nome do cliente");
					String nome = sc.nextLine();
					System.out.println("Digite o cpf do cliente");
					String cpf = sc.nextLine();
					System.out.println("Digite o enderec do cliente");
					String endereco = sc.nextLine();
					
				}
			}
		}
		finally {
			
		}
	}	
}
