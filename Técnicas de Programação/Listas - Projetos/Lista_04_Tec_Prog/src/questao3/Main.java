package questao3;

import questao3.Loja;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Loja loja = new Loja();
		
		System.out.println("Produtos disponiveis: ");
		loja.produtosDisponiveis();
		
		System.out.println("Qual produto deseja comprar?");
		Scanner entrada = new Scanner(System.in);
		String escolha = entrada.nextLine();
		
		loja.comprarNaLoja(escolha);
		
		loja.produtosDisponiveis();
		
	}
}
