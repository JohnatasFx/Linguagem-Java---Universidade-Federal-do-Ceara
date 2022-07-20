package bilheteria;

public class NotaFiscal {
	public String sala;
	public String filme;
	public double valorFilme;
	public double valorAcrescimo;
	public double valorTotal;
	
	public NotaFiscal(String sala, String filme, double valorFilme, double valorAcrescimo){
		this.sala = sala;
		this.filme = filme;
		this.valorFilme = valorFilme;
		this.valorAcrescimo = valorAcrescimo;
		this.valorTotal = valorFilme + (valorFilme * valorAcrescimo);
	}
	
	public String toString() {
		System.out.println("**** Cinema - Cine Morfeu ****");
		System.out.println(filme + " - " + sala);
		System.out.println("Valor do filme:" + " ---> " + valorFilme);
		System.out.println("Acrescimo da Sala:" + " ---> " + (valorAcrescimo)*100 + "%");
		System.out.println("==============================");
		System.out.println("Valor Total: " + " ---> " + valorTotal);
		return "";
	}
}
