package cine.bilheteria;

public class Filme {
    public String nome;
    public String descricao;
    public int duracao;
    public String tipo;
    public double valor;

    public Filme(String nome, String descricao, int duracao, String tipo, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getDuracao(){
        return this.duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    

    
}
