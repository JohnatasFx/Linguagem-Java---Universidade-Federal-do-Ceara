package aulalaboratorio;
import java.util.*;

public class Basica extends Sala {
	
	private Filme filme;
	private String sessao;
	
	protected Basica(String nome, int quantidadeCadeiras, String brinde, String sessao) {
		super(nome, quantidadeCadeiras, brinde);
		this.nome = nome;
		this.quantidadeCadeiras = quantidadeCadeiras;
		this.brinde = brinde;
		this.filme = new Filme("Doutor Estranho", "Filme Marvel", "138 minutos", "18 anos", 19);
		this.sessao = sessao;
		
//		filmes = new ArrayList<Filme>();
//		filmes.add(filme);
//		System.out.println(filmes.toString());
	}
	
//	public String toString() {
//
//		return "Sala: " + nome + "\n" 
//		+ "Quantidade de cadeiras: " + quantidadeCadeiras + "\n" + "Brinde: " + brinde 
//		+ "\n" + "Filme: " + filme + "\n" + "Sessão: " + sessao + "\n";
//	}
	@Override
	public double acrescimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean validarCadeiras() {
		
		return true;
	}
}
