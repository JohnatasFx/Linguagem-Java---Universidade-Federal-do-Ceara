package polimorfismo;

import java.util.ArrayList;

public class Torre {

	private ArrayList<FormaGeometrica> listaFormas;

	public Torre() {
		listaFormas = new ArrayList<FormaGeometrica>();
	}

	public void addFormaGeometrica(FormaGeometrica forma) {

		listaFormas.add(forma);
	}

	public double calcularArea() {
		double area = 0;

		for (FormaGeometrica fm : listaFormas) {
			area += fm.calcularArea();
		}

		return area;
	}
	
	public boolean validarFormas() {
	
		for (FormaGeometrica formaGeometrica : listaFormas) {
			if(!formaGeometrica.formaValida())
				return false;
		}
		return true;
	}
}
