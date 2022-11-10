package br.imd.ufrn.dominio;

public class AcimaVelocidadeException extends Exception {
	public AcimaVelocidadeException () {}
	
	public AcimaVelocidadeException (String errorMessage) {
		super(errorMessage);
	}
}