package br.imd.ufrn.dominio;

public class PistaException extends Exception {
	public PistaException () {}
	
	public PistaException (String errorMessage, Exception a) {
		super(errorMessage, a);
	}
}
