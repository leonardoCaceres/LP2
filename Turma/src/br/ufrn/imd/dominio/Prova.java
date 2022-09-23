package br.ufrn.imd.dominio;

public class Prova {
	private double notaParte1;
	private double notaParte2;
	
	public Prova() {
		
	}
	
	public Prova(double notaParte1, double notaParte2) {
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
	}
	
	public double getNotaParte1() {
		return notaParte1;
	}

	public void setNotaParte1(double notaParte1) {
		this.notaParte1 = notaParte1;
	}

	public double getNotaParte2() {
		return notaParte2;
	}

	public void setNotaParte2(double notaParte2) {
		this.notaParte2 = notaParte2;
	}

	public double calcularNotaTotal() {
		double media = 0;
		media = notaParte1 + notaParte2;
		
		if(media > 10)
		{
			media = -1;
		}
		
		return media;
	}
}
