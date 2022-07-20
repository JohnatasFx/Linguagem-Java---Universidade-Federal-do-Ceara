package bilheteria;

import java.util.ArrayList;

public class Bilheteria {
    public ArrayList<Filme> filmes;
    public ArrayList<Sala> salas;
    public Sala basica; 
    public Sala xd;
    public Sala superConfortavel; 
    public Sala luxo;

    public Bilheteria(){
        this.filmes = new ArrayList<Filme>();
        this.salas = new ArrayList<Sala>();

    }
    
    public void cadastrarSala(String nome, int assentos, String brinde, double acrescimo) {
    	this.salas.add(new Sala(nome, assentos, brinde, acrescimo));
    }

    public void cadastrarFilme(String nome, String descricao, int duracao, String tipo, double valor){
        this.filmes.add(new Filme(nome, descricao, duracao, tipo, valor));  
    }
    
    public ArrayList<Sala> getAllSalas(){
    	return this.salas;
    }
    public ArrayList<Filme> getAllFilmes(){
        return this.filmes;
    }
    
    public Sala getSalaBasica(){
        return this.basica;
    }
    
    public Sala getSalaXd(){
        return this.xd;
    }

    public Sala getSalaSuperConfortavel(){
        return this.superConfortavel;
    }

    public Sala getSalaLuxo(){
        return this.luxo;
    }

    public void setFilmeNaSala(Sala sala, Filme filme){
        sala.setFilme(filme);
    }
}