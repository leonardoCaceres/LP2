package br.imd.ufrn.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Paciente extends Pessoa{
	protected String endereco;
	protected double numeroSUS;
	protected ArrayList<String> remedio = new ArrayList<String>();
	protected Historico historicoDoPaciente;
	protected String prioridade;
	protected String sintomas;
	protected String sexo;
	protected ArrayList<String> exames = new ArrayList<String>();
	protected String idade;
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = calculoIdade(dataNascimento);
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getCPF() {
		return this.cpf;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public double getTelefone() {
		return this.telefone;
	}
	public void getdDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getdDataNascimento() {
		return this.dataNascimento;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSenha() {
		return senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getNumeroSUS() {
		return numeroSUS;
	}
	public void setNumeroSUS(double numeroSUS) {
		this.numeroSUS = numeroSUS;
	}
	public ArrayList<String> getRemedio() {
		return remedio;
	}
	public void setRemedio(ArrayList<String> remedio) {
		this.remedio = remedio;
	}
	public Historico getHistoricoDoPaciente() {
		return historicoDoPaciente;
	}
	public void setHistoricoDoPaciente(Historico historicoDoPaciente) {
		this.historicoDoPaciente = historicoDoPaciente;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		sintomas = sintomas;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		prioridade = prioridade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public ArrayList<String> getExames() {
		return exames;
	}
	public void setExames(ArrayList<String> exames) {
		this.exames = exames;
	}
	
	public String toString() {
		return "Hey";
	}
	
	public void consulta() {
		
	}
	
	public Paciente() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Nome:");
		setNome(sca.next());
		System.out.println("CPF:");
		setCPF(sca.next());
		System.out.println("Sexo:");
		setSexo(sca.next());
				
		//sca.close();
	}
	public static String calculoIdade(LocalDate dataNascimento) {
        if ((dataNascimento != null) && (LocalDate.now() != null)) {
        	String s=String.valueOf(Period.between(dataNascimento, LocalDate.now()).getYears());
            return s;
        }
        else {
            return "0";
        }
    }
	public String dadosImportantes() {
		return "Nome: "+ getNome() +"\nIdade: "+ getIdade() +" - Sexo: "+ getSexo()+
				"\nSintomas: "+getSintomas();
	}
}
