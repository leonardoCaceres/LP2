package br.imd.ufrn.main;

import java.util.Scanner;

import br.imd.ufrn.dominio.AcimaVelocidadeException;
import br.imd.ufrn.dominio.Automovel;
import br.imd.ufrn.dominio.Pista;
import br.imd.ufrn.dominio.PistaException;

public class Aplicacao {
	public static void main(String[] args) throws AcimaVelocidadeException, PistaException {
		//Scanner sc = new Scanner(System.in);
		
		Pista pista = new Pista();
		
		try {
			pista.iniciar();
		}
		catch (PistaException exc) {
			 System.out.println("Pista foi bloqueada!");
			 exc.printStackTrace();
		}
		//System.out.println(carro.getVelocidadeAtual());
		//carro.acelerar(100);
		//System.out.println(carro.getVelocidadeAtual());
		//carro.acelerar(100);
	}
}
