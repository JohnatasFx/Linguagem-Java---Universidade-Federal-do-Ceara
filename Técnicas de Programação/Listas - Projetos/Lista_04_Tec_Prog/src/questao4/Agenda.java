package questao4;

import java.util.ArrayList;

import questao4.Contato;

public class Agenda {
	String nome;
	String descricao;
	ArrayList<Contato> contatos;
	
	public Agenda(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		contatos = new ArrayList<Contato>();
		System.out.println(mostrarAgenda());
		
		try {
			Contato a = new Contato(1001, "Johnatas Felix", "Johnatasfelix@gmail.com");
			contatos.add(a);
			Contato b = new Contato(1002, "Professor Fischer", "fischer@gmail.com");
			contatos.add(b);
			Contato c = (Contato)a.clone();
			contatos.add(c);
		}catch (CloneNotSupportedException e) {
			
		}
		for (Contato contato : contatos) {
			System.out.println();
			contato.mostrarContato();
			contato.verificarContato();
		}
	}
	
	public String mostrarAgenda() {
		return nome + " - " + descricao;
	}
}
