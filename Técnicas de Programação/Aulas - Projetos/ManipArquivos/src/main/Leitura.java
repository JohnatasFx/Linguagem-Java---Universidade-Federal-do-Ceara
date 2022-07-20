package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura {

	public ArrayList<String> lista;

	public Leitura() {
		lista = new ArrayList<String>();
	}
	public void ler(String caminho) {
		BufferedReader br;
		System.out.println(caminho);

		try {
			br = new BufferedReader(new FileReader(caminho));

			while (br.ready()) {
//				System.out.println(br.readLine());
				lista.add(br.readLine());
				splitLinha(br.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void imprimir() {
//		for (String s : lista) {
//			System.out.println("lista: " + s);
//		}
//		System.out.println(lista.get(0));
//		splitLinha(lista.get(0));
	}
	

	public void splitLinha(String linha) {

		
		if (linha != null) {
			String[] splite = linha.split(";");
		    
			for (int i = 0; i < splite.length; i++) {
				System.out.println(splite[i] + " ");
			}
			System.out.println("\n");
		}
	}
}
