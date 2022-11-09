package br.imd.ufrn.main;

import java.util.Scanner;

import br.imd.ufrn.dominio.AcimaVelocidadeException;
import br.imd.ufrn.dominio.Automovel;

public class AutomovelMain {
	public static void main(String[] args) throws AcimaVelocidadeException {
		Scanner sc = new Scanner(System.in);
		
		Automovel carro = new Automovel();
		
		System.out.println(carro.getVelocidadeAtual());
		carro.acelerar(100);
		System.out.println(carro.getVelocidadeAtual());
		carro.acelerar(100);
	}
}
