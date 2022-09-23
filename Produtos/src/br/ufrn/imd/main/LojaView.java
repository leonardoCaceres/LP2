package br.ufrn.imd.main;

import java.sql.Date;

import br.ufrn.imd.dominio.Deposito;
//import br.ufrn.imd.dominio.Produto;
import br.ufrn.imd.dominio.ProdutoNaoDuravel;
import br.ufrn.imd.dominio.ProdutoDuravel;

public class LojaView {
	public static void main(String[] args) {
		Deposito deposito = new Deposito();
		ProdutoDuravel carro = new ProdutoDuravel("carro", 25000, "fiat", "descricaoA", null, 7);
		ProdutoDuravel celular = new ProdutoDuravel("celular", 2000, "xiaomi", "descricaoB", null, 5);
		ProdutoDuravel livro = new ProdutoDuravel("livro", 200, "A mão e a luva", "descricaoC", null, 6);
		ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel("chocolate", 10, "nestle", "descricaoD", null, null, "alimento");
		ProdutoNaoDuravel toalha = new ProdutoNaoDuravel("toalha", 20, "j&j", "descricaoE", null, null, "higiene");
		ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel("sabonet", 3, "oboticario", "descricaoF", null, null, "higiene");
		
		deposito.statusDoDeposito();
		
		deposito.adicionarProduto(carro);
		deposito.adicionarProduto(celular);
		deposito.adicionarProduto(livro);
		deposito.adicionarProduto(chocolate);
		deposito.adicionarProduto(toalha);
		deposito.adicionarProduto(sabonete);
		
		deposito.quantidadeDeProdutos();
		
		deposito.removerProduto(celular);
		
		deposito.quantidadeDeProdutos();
		
		deposito.produtoDeMaiorPreco();
		
		deposito.removerProduto(carro);
		
		deposito.produtoDeMaiorPreco();
	}
}
