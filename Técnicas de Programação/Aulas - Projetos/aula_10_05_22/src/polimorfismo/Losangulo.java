package polimorfismo;

public class Losangulo extends FormaGeometrica {

	private double diagonal1;
	private double diagonal2;
	
	public Losangulo(double diagonal1, double diagonal2) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	public double calcularArea() {
		return (diagonal1 * diagonal2) * 0.5 ;
	}

	@Override
	public boolean formaValida() {
		if(diagonal1 == diagonal2) {
			System.out.println("Losangulo invalido");
			return false;
		}else if(diagonal1 == 0 || diagonal2 ==0) {
			System.out.println("Losangulo invalido");
			return false;
		}else
		return true;
	}

}
