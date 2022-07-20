package aula25_04_22;

public class Jogo {

	public static void main(String[] args) {

		Corrida corrida = new Corrida();

		// Carro c1= new Carro(1, "AAA-1012");
		// corrida.listaCarro.add(c1);

		corrida.listaCarro.add(new Carro(1, "AAA-1012"));
		corrida.listaCarro.add(new Carro(2, "AAA-1112"));
        corrida.listaCarro.add(new Carro(3,"EEE-1212"));
		
        
//		for (int i = 0; i < corrida.listaCarro.size(); i++) {
//			System.out.println(corrida.listaCarro.get(i));
//		}

		for (Carro carro : corrida.listaCarro) {
			System.out.println(carro);
		}

		
//		int vet[] = new int[10];
//
//		for (int i : vet) {
//			System.out.println(i);
//		}

		// corrida.carros[0]= new Carro(1, "AAA-1012");
		// corrida.carros[1]= new Carro(2, "AAA-1112");
		// corrida.carros[2]= new Carro(3, "AAA-1212");
		// corrida.carros[3]= new Carro(4, "AAA-1312");
		// corrida.carros[4]= new Carro(5, "AAA-1412");
		// corrida.carros[5]= new Carro(6, "AAA-1512");
		// corrida.carros[6]= new Carro(7, "AAA-1612");
		// corrida.carros[7]= new Carro(8, "AAA-1712");
		// corrida.carros[8]= new Carro(9, "AAA-1812");
		// corrida.carros[9]= new Carro(10, "AAA-1912");
		// corrida.carros[10]= new Carro(10, "AAA-1912");
		//
		// for (int i = 0; i < 10; i++) {
		// System.out.println(corrida.carros[i]);
		// }

		// Carro c = new Carro(1, "AAA-1212");
		// Barreira cone= new Barreira("Cone", 2);
		// Barreira pedra= new Barreira("Cone", 70);
		//
		// System.out.println(c);
		// c.computarDano(cone);
		// System.out.println(c);
		// c.computarDano(pedra);
		// System.out.println(c);
	}

}
