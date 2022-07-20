package questao3;

import java.util.*;

public class Loja {

	ArrayList<Produto> compras;
	ArrayList<Produto> disponiveis;

	public Loja() {
		disponiveis = new ArrayList<Produto>();
		compras = new ArrayList<Produto>();
		
		Produto lapis = new Produto("Lapis", 1.00, 100);
		Produto caneta = new Produto ("Caneta", 2.00, 100);
		disponiveis.add(lapis);
		disponiveis.add(caneta);
		
	}

	public void produtosDisponiveis() {
		for (Produto produto : disponiveis) {
			System.out.println(produto.nome + ": " + produto.preço + " R$" + " x " + produto.quantidade);
		}
	}
	
	public void comprarNaLoja(String escolha) {
		for (Produto produto : disponiveis) {
			String nome = produto.nome;
			if(nome == escolha) {
				System.out.println("Quantos deseja comprar?");
				Scanner entrada = new Scanner(System.in);
				int quantidade = entrada.nextInt();
				produto.comprarProduto(quantidade);
			}
		}
	}
}
