package regrasNegocio;

import java.util.ArrayList;

import Apresentacao.Menu;

public class Jogo {

	public Menu menu;

	public ArrayList<BatalhaIndividual> batalhas;

	public Jogo() {
		batalhas = new ArrayList<BatalhaIndividual>();
		menu = new Menu();
	}

	private void montarbatalhasIndividuais() {

		Personagem morfeu;
		Personagem copinho;
		int tamanhoLista= menu.selecionarTamanhoDaLista();
		int numeroSoldados=  menu.selecionarNumeroSoldados();
		BatalhaIndividual batalha;
		
		for (int i = 1; i <=numeroSoldados; i++) {

			morfeu= new Morfeu(tamanhoLista, "M-"+i);
			copinho= new Copinho(tamanhoLista, "C-"+i);
			batalha= new BatalhaIndividual(morfeu, copinho, i);
			batalhas.add(batalha);
		}
	}

	public void iniciar() {

		montarbatalhasIndividuais();
		
		for (BatalhaIndividual b : batalhas) {
			b.lutar();
			menu.imprimirRelatorioFinal(b);	
		}
		
		menu.relatorioFinal();
		
	}

}
