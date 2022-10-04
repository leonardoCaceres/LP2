package br.imd.ufrn.dominio;

public class Funcionario {
	protected double salario;
	protected String tipoFuncionario;
	
	public Funcionario() {
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public double calcularSalario() {
		return salario;
	}
}
