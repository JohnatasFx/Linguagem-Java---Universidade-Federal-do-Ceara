package Apresentacao;

import java.util.Scanner;
import regrasNegocio.BatalhaIndividual;
import regrasNegocio.Personagem;

public class Menu {

	public Scanner ler;

	public Menu() {
		ler = new Scanner(System.in);
	}

	public void apresentacao() {

		System.out.println("***** Bem vindo ao jogo do Senhor dos Cafes! ****");
	}

	public int selecionarNumeroSoldados() {
		System.out.println(" Informe o número de soldados");
		return ler.nextInt();
	}

	public int selecionarTamanhoDaLista() {
		
		System.out.println(" Informe o a quantidade de itens de acoes");
		return ler.nextInt();
	}
	
	public void imprimirRelatorioFinal(BatalhaIndividual b) {
		
		Personagem morfel= b.getMorfeu();
		Personagem copinho= b.getCopinho();
		
		System.out.println(" Batalha individual: " + b.getCodigo());
		System.out.println("\n Combatentes: ");
		System.out.println(" Morfel: " + morfel.getNome() +
				" pontuacao: "+ morfel.getPontuacao());
		System.out.println(" Copinho: " + copinho.getNome()+ 
				" pontuacao: "+ copinho.getPontuacao());
		System.out.println(" vencedor: " + b.getVencedor().getNome());
		
		System.out.println("Acoes M: " + morfel.listaDeAcoesOrganizadas());
		System.out.println("Acoes C: " + copinho.listaDeAcoesOrganizadas());
		
		
	}

	public void relatorioFinal() {
		
	}

}
