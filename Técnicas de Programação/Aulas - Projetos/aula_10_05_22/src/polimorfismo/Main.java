package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Torre t = new Torre();

		t.addFormaGeometrica(new Quadrado(10));
		t.addFormaGeometrica(new Triangulo(3,4,5));
		t.addFormaGeometrica(new Retangulo(10, 15));
		t.addFormaGeometrica(new Losangulo(6,12));
		t.addFormaGeometrica(new Circulo(10));

		System.out.println(t.calcularArea());
		System.out.println(t.validarFormas());
	}
}
