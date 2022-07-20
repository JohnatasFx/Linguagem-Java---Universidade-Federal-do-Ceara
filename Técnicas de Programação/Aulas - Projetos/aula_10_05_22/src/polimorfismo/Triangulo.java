package polimorfismo;

public class Triangulo extends FormaGeometrica {

	private double lado2;
	private double lado3;

	public Triangulo(double lado, double lado2, double lado3) {
		this.lado = lado;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double calcularArea() {
		double p = (lado + lado2 + lado3) / 2;
		double area = Math.sqrt(p * (p - lado) * (p - lado2) * (p - lado3));
		return area;
	}

	public boolean formaValida() {
		if(lado <= 0 || lado2 <=0 || lado3 <= 0) {
			System.out.println("Triangulo invalido");
			return false;
		}
		return true;
	}

}
