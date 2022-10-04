package br.imd.ufrn.main;

import br.imd.ufrn.dominio.Funcionario;
import br.imd.ufrn.dominio.Gerente;
import br.imd.ufrn.dominio.Vendedor;

public class EmpresaView {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setTipoFuncionario("Engenheiro");
		f.setSalario(4500.50);
		f.calcularSalario();
		
		Vendedor v = new Vendedor();
		v.setTipoFuncionario("Vendedor");
		v.setSalario(1500);
		v.setComissao(500);
		v.calcularSalario();
		
		Gerente g = new Gerente();
		g.setTipoFuncionario("Gerente");
		g.setSalario(7500);
		g.setBonus(2000);
		g.calcularSalario();
		
		System.out.println("Salario " + f.getClass() + " R$ " + f.getSalario());
		System.out.println("Salario " + v.getClass() + " R$ " + v.getSalario());
		System.out.println("Salario " + g.getClass() + " R$ " + g.getSalario());
		
		System.out.println("Salario " + f.getClass() + " R$ " + v.getSalario());
		System.out.println("Salario " + v.getClass() + " R$ " + v.getSalario());
		System.out.println("Salario " + g.getClass() + " R$ " + g.getSalario());
		System.out.println();
		System.out.println("Funcionario instanceof Funcionario " + (f instanceof Funcionario));
		System.out.println("Funcionario instanceof Vendedor " + (f instanceof Vendedor));
		System.out.println("Funcionario instanceof Gerente " + (f instanceof Gerente));
		System.out.println("Vendedor instanceof Funcionario " + (v instanceof Funcionario));
		System.out.println("Vendedor instanceof Vendedor " + (v instanceof Vendedor));
		//System.out.println("Vendedor instanceof Gerente " + (v instanceof Gerente));
		System.out.println("Gerente instanceof Funcionario " + (g instanceof Funcionario));
		//System.out.println("Gerente instanceof Vendedor " + (g instanceof Vendedor));
		System.out.println("Gerente instanceof Gerente " + (g instanceof Gerente));

	}
}
