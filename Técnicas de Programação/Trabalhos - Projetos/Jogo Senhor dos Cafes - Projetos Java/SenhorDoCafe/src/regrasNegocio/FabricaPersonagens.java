package regrasNegocio;

import java.util.ArrayList;

public class FabricaPersonagens {

	public Personagem getPersonagem(String tipos) {

		TiposPersonagens tipo = TiposPersonagens.valueOf(tipos);
		switch (tipo) {
		case MOR:
			return new Morfeu(tipo);
		case COP:
			return new Copinho(tipo);
		case CAF:
			return new Cafezito(tipo);
		case NEO:
			return new Neo(tipo);
		case ORC:
			return new Oraculo(tipo);
		case TRI:
			return new Trinity(tipo);

		default:
			return null;
		}

	}

	public Personagem criarPrimeiroPersonagem(ArrayList<String> linha) {

		Personagem p = this.getPersonagem(linha.get(3));
		p.setNome(linha.get(4));

		for (int i = 7; i < 17; i++) {
			p.addAtaque(Integer.parseInt(linha.get(i)));
		}

		for (int i = 17; i < 27; i++) {
			p.addDefesa(Integer.parseInt(linha.get(i)));
		}
		return p;
	}
	
	public Personagem criarSegundoPersonagem(ArrayList<String> linha) {

		Personagem p = this.getPersonagem(linha.get(5));
		p.setNome(linha.get(6));

		for (int i = 27; i < 37; i++) {
			p.addAtaque(Integer.parseInt(linha.get(i)));
		}

		for (int i = 37; i < 47; i++) {
			p.addDefesa(Integer.parseInt(linha.get(i)));
		}
		return p;
	}

}
