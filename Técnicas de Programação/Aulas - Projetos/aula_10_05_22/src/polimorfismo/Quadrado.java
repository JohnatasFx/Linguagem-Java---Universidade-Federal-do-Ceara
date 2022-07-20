package polimorfismo;

public class Quadrado  extends FormaGeometrica{

	
	public Quadrado(int lado) {
		this.lado=lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public boolean formaValida() {
		if(lado <=0) {
			System.out.println("Quadrado inválido");
			return false;
		}
		return true;
	}

	
}
