package aula25_04_22;

public class Barreira {

	public String nome;
	public int dano;
	
	 public Barreira(String nome, int dano) {
		 this.nome=nome;
		 this.dano= dano;
	 }
	 
	 public void verificar() {
		 if(dano>100)
			 dano=100;
	 }
}
