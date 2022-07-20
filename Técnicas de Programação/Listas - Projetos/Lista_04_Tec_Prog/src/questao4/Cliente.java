package questao4;

import java.util.ArrayList;

public class Cliente {
	ArrayList<Agenda> agendas;
	
	public Cliente() {
		agendas = new ArrayList<Agenda>();
		Agenda a = new Agenda("Agenda UFC", "Contatos da Faculdade");
		agendas.add(a);
		
	}
}
