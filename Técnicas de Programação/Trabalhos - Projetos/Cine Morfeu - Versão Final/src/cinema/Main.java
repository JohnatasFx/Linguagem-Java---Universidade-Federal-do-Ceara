package cinema;

import java.util.ArrayList;
import java.util.Scanner;

import bilheteria.Bilheteria;
import bilheteria.Filme;
import bilheteria.NotaFiscal;
import bilheteria.Sala;

public class Main {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Bilheteria bilheteria = new Bilheteria();

		bilheteria.cadastrarSala("Sala Basica", 200, "Sem brinde", 0);
		bilheteria.cadastrarSala("Sala XD", 200, "Bonequinho do morfeu", 0.1);
		bilheteria.cadastrarSala("Sala Super Confortavel", 150, "Bonequinho do morfeu, mais\num combo de pipoca", 0.12);
		bilheteria.cadastrarSala("Sala de Luxo", 100,
				"Bonequinho do morfeu, mais\num combo de pipoca, refrigerante e chocolate", 0.15);

		bilheteria.cadastrarFilme("Era do Gelo", "Animais sobrevivendo a era do gelo", 120, "Acao e diversao", 20);
		bilheteria.cadastrarFilme("Star Wars 8", "Guerra nas estrelas", 120, "Acao", 20);

		ArrayList<Filme> filmes = bilheteria.getAllFilmes();
		ArrayList<Sala> salas = bilheteria.getAllSalas();

		int i;
		for (i = 0; i < salas.size(); i++) {
			for (int j = 0; j < filmes.size(); j++) {
				bilheteria.setFilmeNaSala(bilheteria.salas.get(i), filmes.get(j));
			}
		}

		System.out.println("----------------------------------");
		System.out.println("**** Bem Vindos ao CineMorfeu ****");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Filmes disponiveis:");
		System.out.println();

		i = 1;
		for (Filme filme : filmes) {
			System.out.println("Filme " + i);
			System.out.println("Nome: " + filme.nome);
			System.out.println("Descricao: " + filme.descricao);
			System.out.println("Duração: " + filme.duracao + " Minutos.");
			System.out.println("Tipo: " + filme.tipo + "");
			System.out.println("Preço: " + filme.valor + "R$");
			System.out.println();
			i++;
		}

		System.out.println("Qual filme deseja assistir?");
		for (i = 0; i < filmes.size(); i++) {
			System.out.println("Filme " + (i + 1) + ": " + filmes.get(i).getNome());
		}
		int escolhaFilme = entrada.nextInt();

		System.out.println("O filme " + filmes.get(escolhaFilme - 1).getNome() + " esta disponivel na(s) sala(s): ");

		for (i = 0; i < salas.size(); i++) {
			System.out.println();
			System.out.println("--------- " + bilheteria.salas.get(i).getNome() + " ---------");
			System.out.println("Quantidade de cadeiras: " + bilheteria.salas.get(i).getAssentos());
			double valor = bilheteria.salas.get(i).getFilme().getValor()
					+ (bilheteria.salas.get(i).getAcrescimo() * bilheteria.salas.get(i).getFilme().getValor());
			System.out.println("Preço do filme com Acrescimo da sala: " + valor);
			System.out.println("Brinde da sala: " + bilheteria.salas.get(i).getBrinde());
			System.out.println();
		}
		for (i = 0; i < salas.size(); i++) {
			System.out.println((i + 1) + " - " + salas.get(i).getNome());
		}
		System.out.println("Qual sala deseja assistir " + filmes.get(escolhaFilme - 1).getNome() + "?");

		int escolhaSala = entrada.nextInt();

		NotaFiscal n = new NotaFiscal(salas.get(escolhaSala - 1).getNome(), filmes.get(escolhaFilme - 1).getNome(),
				filmes.get(escolhaFilme - 1).getValor(), salas.get(escolhaSala - 1).getAcrescimo());
		System.out.println(n.toString());
		entrada.close();
	}
}
