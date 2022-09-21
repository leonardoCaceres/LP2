package br.ufrn.imd.dominio;

public class Conta extends Cliente{
	private int numeroDaConta;
	private int tipoDeConta;
	private double saldo;
	
	public Conta() {

	}
	
	public Conta(int numeroDaConta, int tipoDeConta) {
		this.numeroDaConta = numeroDaConta;
		this.tipoDeConta = tipoDeConta;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(int tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
