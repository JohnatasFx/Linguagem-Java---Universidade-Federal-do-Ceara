package main;


public class Recursao {

	// 1 função deve ser pequena em numero de linhas
	// 2 o nome da funcao tem que ser relevante para o dominio
	// 3 pequena lista de parametros
	// 4 a funcao nao pode fazer mais de uma coisa
	// 5 o codigo da funcao nao pode ser repetido em outra funcao

	// visibilidade: public private protected

	public static int soma(int primeiro, int segundo) {
		System.out.println("Soma ");
		return primeiro + segundo;
	}

	public static int soma2() {
		System.out.println("Soma2 ");
		return 10;
	}

	public static void f1(int num) {
		System.out.println("Sou a funcao f1"+ num);
		f2(num+1);
	}
	public static void f2(int num) {
		System.out.println("Sou a funcao f2"+ num);
		f3(num+1);
	}
	public static void f3(int num) {
		System.out.println("Sou a funcao f3"+ num);
		f4(num+1);
	}
	public static void f4(int num) {
		System.out.println("Sou a funcao f4"+ num);
		f1(num+1);
	}
	
	public static int r1(int i) { 
		
		i++;
		if(i>2) {
			return i;
		}
		 return r1(i);
	}
	public static void main(String[] args) {
//		f1(1);
		System.out.println(r1(1));
//		for (int i = 0; i < 10; i++) {
//			
//		}
//		int i=0;
//		while(i<10) {
//			System.out.println("Oi");
//		 i++;
//		}
//		recursao();
	}

}
