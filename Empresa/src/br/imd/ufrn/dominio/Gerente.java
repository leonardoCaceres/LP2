package br.imd.ufrn.dominio;

public class Gerente extends Funcionario{
	private double bonus;
	
	public Gerente() {
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calcularSalario() {
		this.salario += bonus;
		return salario;
	}
}
