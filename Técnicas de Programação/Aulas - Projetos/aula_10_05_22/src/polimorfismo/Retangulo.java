package polimorfismo;

public class Retangulo extends FormaGeometrica {

	private double segundoLado;

	public Retangulo(int lado, int segundoLado) {
		this.lado=lado;
		this.segundoLado=segundoLado;
	}

	public double calcularArea() {
		return lado * segundoLado;
	}

	
	public boolean formaValida() {
		
		if(this.lado == this.segundoLado) {
			System.out.println("Retangulo invalido");
			return false;
		}
		else if (lado <= 0 || segundoLado <=0) {

			System.out.println("Retangulo invalido");
			return false;
		}
		return true;
	}


}
