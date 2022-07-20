package polimorfismo;

public class Circulo extends FormaGeometrica {
	
	private double pi = 3.14;
	private double diametro;
	
	public Circulo(double diametro) {
		this.diametro = diametro;
	}
	@Override
	public boolean formaValida() {
		if(diametro <=0) {
			System.out.println("Circulo invalido");
			return false;
		}else
		return true;
	}

	@Override
	public double calcularArea() {
		return pi * ((diametro/2)*(diametro/2));
	}

}
