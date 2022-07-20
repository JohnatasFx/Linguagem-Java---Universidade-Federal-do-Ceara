package questao3;

import java.util.Scanner;

public class Produto {
	String nome;
	double pre�o;
	int quantidade;

	public Produto(String nome, double pre�o, int quantidade) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}
	
	public void comprarProduto(int comprados) {
		this.quantidade = quantidade - comprados;
	}

	public String getNome() {
		return nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
