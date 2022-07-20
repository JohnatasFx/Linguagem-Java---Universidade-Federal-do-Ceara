package regrasNegocio;

public class BatalhaIndividual {

	private Personagem morfeu;
	private Personagem copinho;
	private Personagem vencedor;
	private  int codigo;

	public BatalhaIndividual(Personagem m, Personagem c, int codigo) {
		this.morfeu = m;
		this.copinho = c;
		this.codigo = codigo;
	}

	
	public Personagem getMorfeu() {
		return morfeu;
	}


	public Personagem getCopinho() {
		return copinho;
	}


	public Personagem getVencedor() {
		return vencedor;
	}


	public int getCodigo() {
		return codigo;
	}


	private int tamanhoListasConsideradas() {
		int tamanhoListaAcoes = 0;

		if (morfeu.getListaAcoes().size() > copinho.getListaAcoes().size()) {
			tamanhoListaAcoes = copinho.getListaAcoes().size();
		} else {
			tamanhoListaAcoes = morfeu.getListaAcoes().size();
		}

		return tamanhoListaAcoes;

	}

	public void lutar() {

		for (int i = 0; i < tamanhoListasConsideradas(); i++) {

			if(morfeu.getListaAcoes().get(i)> copinho.getListaAcoes().get(i)) {
				morfeu.pontuacao++;
			}else if(morfeu.getListaAcoes().get(i)< copinho.getListaAcoes().get(i)) {
				copinho.pontuacao++;
			}
		}
		verificarVencedor();
	}
	
	private void verificarVencedor() {
		
		if(morfeu.pontuacao> copinho.pontuacao) {
			this.vencedor=morfeu;
		}else if(morfeu.pontuacao< copinho.pontuacao) {
			this.vencedor=copinho;
		}else {
			this.vencedor= new Morfeu(1, "Empate");
		}
	}
}
