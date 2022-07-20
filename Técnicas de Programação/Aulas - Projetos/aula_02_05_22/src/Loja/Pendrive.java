package Loja;

public class Pendrive extends Item{

	public double valor;
	public double memoria;
	public String marca;
	
	
	public Pendrive duplicar() {
		return this;
	}
	public Pendrive duplicar2() {
		Pendrive p = new Pendrive();
		p.valor= this.valor;
		p.memoria= this.memoria;
		p.marca= this.marca;
		return p;
		
		
	}
}
