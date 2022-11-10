package br.imd.ufrn.dominio;

public class Automovel {
	static private int velocidadeMaxima = 120;
	private int velocidadeAtual = 0;

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void acelerar(int aceleracao) throws AcimaVelocidadeException {
		if(velocidadeAtual + aceleracao > velocidadeMaxima) {
			throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
		}
		else {
			velocidadeAtual += aceleracao;
		}
		/*
		try {
			if(velocidadeAtual + aceleracao > velocidadeMaxima) {
				throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
			}
			else {
				velocidadeAtual += aceleracao;
			}
		}
		catch(AcimaVelocidadeException exc) {
			throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
		}
		finally {
			
		}
		*/
	}
}
