package br.imd.ufrn.dominio;

import java.util.ArrayList;

public class Historico {
	protected ArrayList<String> doencas = new ArrayList<String>();
	protected ArrayList<String> alergias = new ArrayList<String>();
	//private ArrayList<String> cirurgias = new ArrayList<String>();
}
/*
try {
	double cpfDeEntrada;
	String senhaDeEntrada;
	
	System.out.println("Digite o CPF");
	cpfDeEntrada = sc.nextDouble();
	System.out.println("Digite o SENHA");
	senhaDeEntrada = sc.next();
}
//catch {
	
//}
finally {
}
*/
//Paciente pacienteZero = new Paciente();
//System.out.println(pacienteZero);
/*
if( sc.nextDouble() == paciente.getNumeroSUS()){
	continue;
}else {
	System.out.println(paciente.dadosImportantes());
	pacientes.add(paciente);
}
}
Paciente paciente = buscaPaciente(pacientes);

if(paciente != null) {
System.out.println(paciente.dadosImportantes());
}else {
System.out.println("Paciente não encontrado!");
}


}

else if(acao == 2) {
for(Paciente paciente : pacientes) {
if( sc.nextDouble() == paciente.getNumeroSUS()){
	System.out.println("Digite qual a prioridade do paciente: ");
	if(sc.next().equals("azul")) {
		paciente.setPrioridade("azul");
	}else if(sc.next().equals("verde")) {
		paciente.setPrioridade("verde");
	}else if(sc.next().equals("amarelo")) {
		paciente.setPrioridade("amarelo");
	}else if(sc.next().equals("vermelho")) {
		paciente.setPrioridade("vermelho");
	}else {
		System.out.println("Prioridade INVÁLIDA");
	}	
}
}
}
*/