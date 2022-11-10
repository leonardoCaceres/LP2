package br.imd.ufrn.dominio;

public class Pista {
	public void iniciar() throws PistaException {
		Automovel carro = new Automovel();
		Automovel carro2 = new Automovel();
		Automovel carro3 = new Automovel();

		try {
			carro.acelerar(200);
		}
		catch (AcimaVelocidadeException exc) {
			throw new PistaException("Excedeu a velocidade máxima!", exc);
		}
	}
}
