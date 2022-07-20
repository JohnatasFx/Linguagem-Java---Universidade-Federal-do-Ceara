package cine.bilheteria;

public class Sala {
    public Filme filme;
    public int assentos;
    public String brinde;
    public double acrescimo;

    public Sala(int assentos, String brinde, double acrescimo){
        this.assentos = assentos;
        this.brinde = brinde;
        this.acrescimo = acrescimo;
    }

    public void setFilme(Filme filme){
        this.filme = filme;
    }

    public Filme getFilme(){
        return this.filme;
    }


}
