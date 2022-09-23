package br.ufrn.imd.dominio;

import java.util.ArrayList;
import java.util.Iterator;

public class Deposito {
	
	ArrayList<Object> produtos = new ArrayList<Object>();
	
	public Deposito() {
		
	}
		
	public void adicionarProduto(Object produto)
	{
		produtos.add(produto);
	}
	public void removerProduto(Object produto)
	{
		produtos.remove(produto);
	}
	
	public void quantidadeDeProdutos()
	{
		System.out.println("Quantidade de produtos: " + produtos.size());
	}
	
	public void statusDoDeposito()
	{
		if(produtos.isEmpty()) {
			System.out.println("Nenhum produto no deposito");
		}
		else {
			System.out.println("O deposito não está vazio");
		}
	}
	
	public void produtoDeMaiorPreco()
	{
		Iterator<Object> it = produtos.iterator();
		Produto maisCaro = null;
		double preco = -1;
		while(it.hasNext())
		{
			Produto novoProduto = (Produto)it.next();
			if(novoProduto.getPreco() >= preco) {
				preco = novoProduto.getPreco();
				maisCaro = novoProduto;
				//System.out.println(maisCaro);
			}
		}
		System.out.println("O produto " +  maisCaro.getNome() + " é o mais caro");
		//return maisCaro;
	}
}
