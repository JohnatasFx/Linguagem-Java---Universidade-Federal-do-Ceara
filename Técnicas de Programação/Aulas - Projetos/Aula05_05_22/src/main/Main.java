package main;
import java.util.ArrayList;

public class Main {

	// passagem de parametro por valor para tipo primitivo
	public static int teste(int numero) {

		System.out.println("2 numero informado" + numero);
		return numero + 1;
	}

	// passagem de parametro por referencia para tipos nao primitivo
	public static void popularVetor(int vetor[]) {

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i + 20;
		}
	}

	public static void imprimirVetor(int vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(" indice " + i + " : " + vetor[i]);
		}
		System.out.println("memoria" + vetor);
	}

	public static void torcarValor(int vet[], int indice, int valor) {
		vet[indice] = valor;
	}

	public static void duplicarVetor(int vetA[], int vetB[]) {

		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = vetB[i];
		}
	}

	public static void main(String[] args) {

		int a = 20;
		int vet[] = new int[10];
		int vetB[] = new int[10];

		
		popularVetor(vet);
		System.out.println("\n\n");
		imprimirVetor(vetB);
		imprimirVetor(vet);
		//

		// System.out.println("1 numero informado"+ a);
		// System.out.println("3 numero informado"+ teste(a));
		// System.out.println("4 numero informado"+ a);

	}

}
