package aula_02_05_22;

public class Formas {

	public int tipo;  //tipo=1 quadrado, tipo=2 retangulo, tip=3 triangulo
	
	
	public void calcularArea() {
		
		if(tipo==1) {		
			System.out.println("Quadrado");
		}
		else if(tipo==2) {
			System.out.println("Retangulo");
		}
		else if(tipo==3) {
			System.out.println("Triangulo");
		}
		
	}

}
