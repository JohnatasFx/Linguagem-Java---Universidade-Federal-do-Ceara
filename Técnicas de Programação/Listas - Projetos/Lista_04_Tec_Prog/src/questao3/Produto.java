package questao3;

import java.util.Scanner;

public class Produto {
	String nome;
	double preço;
	int quantidade;

	public Produto(String nome, double preço, int quantidade) {
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	public void comprarProduto(int comprados) {
		this.quantidade = quantidade - comprados;
	}

	public String getNome() {
		return nome;
	}

	public double getPreço() {
		return preço;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
