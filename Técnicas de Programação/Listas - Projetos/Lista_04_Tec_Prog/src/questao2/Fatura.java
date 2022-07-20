package questao2;

import java.util.Scanner;

public class Fatura {
	String serie = "";
	String descricao = "";
	int quantidade = 0;
	double preço = 0.0;
	double valorFatura = 0.0;
	
	public Fatura() {
		System.out.println("Digite a serie do produto: ");
		setSerie(serie);
		
		System.out.println("Digite a descrição: ");
		setDescricao(descricao);
		
		System.out.println("Digite a quantidade: ");
		setQuantidade(quantidade);
		
		System.out.println("Digite o preço unitário:");
		setPreço(preço);
		
		setValorFatura(valorFatura, preço, quantidade);
		
		System.out.println("**** Fatura da Compra ****");
		System.out.println("--------------------------");
		System.out.println("#" + getSerie() + " " + getDescricao() + " = " + getPreço() + " x " + getQuantidade());
		System.out.println("--------------------------");
		System.out.println("Valor Total: " + getValorFatura());
	}
	
	public void setValorFatura(double valorFatura, double preço, int quantidade) {
		double valorTotal = preço * quantidade;
		this.valorFatura = valorTotal;
	}
	
	public double getValorFatura() {
		return valorFatura;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		serie = entradaString();
		this.serie = serie;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		descricao = entradaString();
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		quantidade = entradaInt();
		this.quantidade = quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		preço = entradaPreço();
		this.preço = preço;
	}
	
	public int entradaInt() {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		return numero;
	}
	
	public double entradaPreço() {
		Scanner entrada = new Scanner(System.in);
		double numero = entrada.nextDouble();
		return numero;
	}
	
	public String entradaString() {
		Scanner entrada = new Scanner(System.in);
		String string = entrada.nextLine();
		return string;
	}
}
