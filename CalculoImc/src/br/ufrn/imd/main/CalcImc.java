package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.dominio.Pessoa;

public class CalcImc {

	/*
	public static double imc(double height, double weigth)
	{
		return weigth / Math.pow(height, 2);
	}
	*/

	public static void main(String[] args)
	{
		//Pessoa p = new Pessoa("Leonardo", 80.0, 1.75);
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Digite o nome da pessoa: ");
			p.setNome(sc.nextLine());
			
			System.out.println("Digite o altura de " + p.getNome());
			p.setAltura(sc.nextDouble());
			
			System.out.println("Digite a peso de " + p.getNome());
			p.setPeso(sc.nextDouble());
			
			double imcDaPessoa = p.imc();
			
			System.out.println("O seu IMC é de: " + imcDaPessoa);
			
			if(imcDaPessoa < 18.5)
			{
				System.out.println("Apesar de não estar acima do peso o seu IMC considerado baixo pode trazer riscos"
						+ " a saúde e está vinculado a algumas doenças psicologicas como bulímia e anoxeria considere estudar isso");
			}
			else if(imcDaPessoa >= 18.5 && imcDaPessoa < 25)
			{
				System.out.println("Seu IMC está bom continue assim ;)");
			}
			else if(imcDaPessoa >= 25 && imcDaPessoa < 30)
			{
				System.out.println("Seu IMC está um pouco alto considere repensar sua educação alimentar");
			}
			else if(imcDaPessoa >= 30 && imcDaPessoa < 35)
			{
				System.out.println("Seu IMC está alto o suficiente para afetar sua saúde negativamente considere repensar sua educação alimentar");
			}
			else if(imcDaPessoa >= 35 && imcDaPessoa < 40)
			{
				System.out.println("Seu IMC está alto e seu peso provavelmente já esta afetando sua saúde, considere seriamente procurar um médico");
			}
			else
			{
				System.out.println("Seu IMC está muito alto, problemas de saúde irão acontecer, sua qualidade e expectativa de vida irão ser"
						+ " afetadas negativamente, vá procurar um médico!");
			}
		}
		finally {
			sc.close();
		}
	}
}
