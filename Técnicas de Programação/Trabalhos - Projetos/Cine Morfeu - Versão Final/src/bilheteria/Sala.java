package bilheteria;

public class Sala {
    public Filme filme;
    public String nome;
    public int assentos;
    public String brinde;
    public double acrescimo;

    public Sala(String nome, int assentos, String brinde, double acrescimo){
        this.nome = nome;
    	this.assentos = assentos;
        this.brinde = brinde;
        this.acrescimo = acrescimo;
    }
    
    public Filme getFilme(){
        return this.filme;
    }

    public void setFilme(Filme filme){
        this.filme = filme;
    }

    public String getNome() {
		return nome;
	}

	public int getAssentos() {
		return assentos;
	}

	public String getBrinde() {
		return brinde;
	}

	public double getAcrescimo() {
		return acrescimo;
	}
}
