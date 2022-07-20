package aula25_04_22;

public class Carro {

	private int id;
	private String placa;
	private Motor motor;
	private int vida;

	public Carro(int id, String placa) {
		this.id = id;
		this.placa = placa;
		vida = 100;
		motor = new Motor(2, 1.8);
	}

	public void computarDano(Barreira b) {

		b.verificar();
		this.vida -= b.dano;
	}

	public String toString() {

		return "id: " + id + " placa:" + placa + " vida: " + vida + " id motor: " + motor.getId() + "potencia motor:"
				+ motor.getPotencia() + "\n";
	}
}
