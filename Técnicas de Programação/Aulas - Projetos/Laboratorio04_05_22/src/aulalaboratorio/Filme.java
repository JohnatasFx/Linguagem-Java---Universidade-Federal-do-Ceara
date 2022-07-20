package aulalaboratorio;

import java.util.ArrayList;

public class Filme {
	
	public String nome;
	public String descricao;
	public String duracao;
	public String tipo;
	public int valor;
	
	public Filme(String nome, String descricao, String duracao, String tipo, int valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.duracao = duracao;
		this.tipo = tipo;
		this.valor = valor;
		
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" + "Descrição: " + descricao + "\n" + "Duração: "+ duracao + 
				"\n" + "Indicação: " +tipo + "\n" + "Valor: " + valor + "R$";
	}
}
