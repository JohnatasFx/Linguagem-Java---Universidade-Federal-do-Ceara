package aulalaboratorio;

import java.util.Scanner;

public class Cartaz {

	public Scanner ler;

	public Cartaz() {
		ler = new Scanner(System.in);
	}

	public void apresentacao() {

		System.out.println("***** Bem vindo ao Cine-Morfeu! *****");
	}
	
	public void filmesCartaz() {
		for (Filme filme : Basica.filmes) {
			System.out.println(filme);
		}	
	} 
}
