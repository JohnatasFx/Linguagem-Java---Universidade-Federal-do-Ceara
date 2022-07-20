package aula25_04_22;

public class Main {

	public static boolean buscar(int vet[], int elemento) {
		for (int i = 0; i < vet.length; i++) {
			if (elemento == vet[i])
				return true;
		}

		return false;
	}

	public static void exercicio19(int vet[], int fib[]) {

		for (int i = 0; i < vet.length; i++) {

			if (buscar(fib, vet[i])) {
				System.out.println(vet[i]);
			}
		}
	}

	public static int fibR(int num) {
		
		if(num==0 ) 
			return 0;
		if(num==1) 
			return 1;
		
		return fibR(num-1)+ fibR(num-2);
	}

	public static void fib(int vet[]) {

		vet[0] = 0;
		vet[1] = 1;
		for (int i = 2; i < vet.length; i++) {
			vet[i] = vet[i - 1] + vet[i - 2];
		}
	}

	public static void main(String[] args) {

		int serieFibo[] = new int[100];

		int vet[] = { 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };

		fib(serieFibo);

		exercicio19(vet, serieFibo);

	}

}
