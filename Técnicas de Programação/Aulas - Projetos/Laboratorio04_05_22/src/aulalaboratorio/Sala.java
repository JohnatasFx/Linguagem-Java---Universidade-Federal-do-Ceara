package aulalaboratorio;
import java.util.*;

public abstract class Sala implements Acrescimo{
	
	protected String nome;
	protected int quantidadeCadeiras;
	protected String brinde;
	
	protected Sala(String nome, int quantidadeCadeiras, String brinde){
		
		this.nome = nome;
		this.quantidadeCadeiras = quantidadeCadeiras;
		this.brinde = brinde;
	}
}
