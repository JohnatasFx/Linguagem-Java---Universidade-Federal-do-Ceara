package cine.bilheteria;

import java.util.ArrayList;


public class Bilheteria {
    public ArrayList<Filme> filmes;
    public Sala basica; 
    public Sala xd; 
    public Sala superConfortavel; 
    public Sala luxo;

    public Bilheteria(){
        this.filmes = new ArrayList<Filme>();
        this.basica = new Sala(200, "Sem brinde", 0);
        this.xd = new Sala(200, "Bonequinho do morfeu", 0.1);
        this.superConfortavel = new Sala(150, "Bonequinho do morfeu, mais um combo de pipoca", 0.12);
        this.luxo = new Sala(100, "Bonequinho do morfeu, mais um combo de pipoca, refrigerante e chocolate", 0.15);
    }

    public void cadastrarFilme(String nome, String descricao, int duracao, String tipo, double valor){
        this.filmes.add(new Filme(nome, descricao, duracao, tipo, valor));  
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
