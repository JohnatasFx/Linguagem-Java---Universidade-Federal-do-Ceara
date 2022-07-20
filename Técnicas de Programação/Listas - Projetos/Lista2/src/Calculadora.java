import java.util.*;

public class Calculadora {

	public static int[] vetor() {
		int a = 0;

		System.out.println("Digite o tamanho do vetor: ");
		a = entrada();
		int[] vetor = new int[a];

		System.out.println("Digite números para o vetor: ");
		for (int i = 0; i < a; i++) {
			vetor[i] = entrada();
		}
		return vetor;
	}

	public static int entrada() {
		Scanner entrada = new Scanner(System.in);
		int a = 0;
		a = entrada.nextInt();

		return a;
	}

	public static void pesquisa(int[] vetor) {

		int a = 0;
		System.out.println("Que numero deseja pesquisar no vetor?");
		a = entrada();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == a) {
				System.out.println("O numero " + a + " está no vetor! na posição " + (i+1) + ".");
			}
		}

	}

	public static void pesquisaPorIndice(int[] vetor) {

		int a = 0;
		System.out.println("Digite o indice que deseja pesquisar: ");
		a = entrada();
		System.out.println("O numero na posição " + a + " é: " + vetor[a]);

	}

	public static void separação() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] >= 0) {
				vetorB[j] = vetorA[i];
				j++;
			} else {
				vetorC[k] = vetorA[i];
				k++;
			}
		}
		System.out.println("Numeros positivos do vetor: ");
		for (int i = 0; i < vetorB.length; i++) {
			if (vetorB[i] != 0)
				System.out.println(vetorB[i]);
		}
		System.out.println("Números negativos do vetor: ");
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorC[i] != 0) {
				System.out.println(vetorC[i]);
			}
		}

	}

	public static void somatório(int[] vetor) {
		int a = 0;
		for (int i = 0; i < vetor.length; i++) {
			a += vetor[i];
		}
		System.out.println("O somatório de todos os numeros do vetor é: " + a);
	}

	public static void produto(int[] vetor) {
		int a = 1;
		for (int i = 0; i < vetor.length; i++) {
			a *= vetor[i];
		}
		System.out.println("O produto de todos os numeros do vetor é: " + a);
	}

	public static void produtoEscalar() {
		int[] vetorA = vetor();
		System.out.println("O tamanho do vetor 1 (ULTIMO DIGITADO) é: " + vetorA.length);
		System.out.println("Digite um vetor de mesmo tamanho, se possível.");
		int[] vetorB = vetor();
		int a = 0;

		for (int i = 0; i < vetorA.length; i++) {
			a += vetorA[i] * vetorB[i];
		}
		System.out.println("O resultado do produto escalar dos vetores A e B, é: " + a);
	}

	public static void completaComZero() {
		int[] vetor = vetor();
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("Vetor digitado: ");
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			if (i == vetor.length - 1) {
				System.out.print(vetor[i] + "]");
			} else {
				System.out.print(vetor[i] + ", ");
			}
		}
		System.out.println("Escolha um numero do vetor: ");
		a = entrada();

		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != a && b == 0) {
				System.out.print(vetor[i] + ", ");
			} else if (vetor[i] == a && b == 0) {
				System.out.print(vetor[i] + ", ");
				b++;
			} else if (i == vetor.length - 1 && b == 1) {
				System.out.print(c + "]");
			} else {
				System.out.print(c + ", ");
			}
		}

	}

	public static void quadrado() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.println("O vetor digitado, ao quadrado, é igual a: ");
		System.out.print("[");
		for (int i = 0; i < vetorB.length; i++) {
			if (i == vetorB.length - 1) {
				System.out.print(vetorB[i] + "]");
			} else {
				System.out.println(vetorB[i] + ", ");
			}
		}
	}

	public static void media() {
		int[] vetor = vetor();
		int soma = 0;
		int media = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = soma / vetor.length;
		System.out.println("A media dos numeros do vetor é: " + media);
	}

	public static void maximo() {
		int[] vetor = vetor();
		int maximo = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maximo) {
				maximo = vetor[i];
			} else {

			}
		}
		System.out.println("O maior numero do vetor é: " + maximo);
	}

	public static void minimo() {
		int[] vetor = vetor();
		int minimo = vetor[0];

		for (int i = 1; i <= vetor.length; i++) {
			if (minimo > vetor[i]) {
				minimo = vetor[i];
			} else {

			}
		}
		System.out.println("O menor numero do vetor é: " + minimo);
	}

	public static void modaUnimodal() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			int k = 0;
			for (int j = 0; j < vetorA.length; j++) {
				if (vetorA[i] == vetorA[j]) {
					k++;
				}
			}
			vetorB[i] = k;
		}
		int moda = vetorB[0];
		for (int i = 1; i <= vetorA.length; i++) {
			if (moda < vetorB[i]) {
				moda = vetorB[i];
			}
		}
		System.out.println("A moda unimodal do vetor é: " + moda);
	}

	public static void mediana() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];

		for (int i = 1; i < vetorA.length + 1; i++) {
			if (vetorA[i] < vetorA[i - 1]) {
				vetorB[i] = vetorA[i - 1];
				vetorA[i - 1] = vetorA[i];
				vetorA[i] = vetorB[i];
			}
		}
		if (vetorA.length % 2 == 0) {
			int a = vetorA.length / 2;
			System.out.println("A mediana está entre: " + vetorA[a - 1] + " e " + vetorA[a + 1]);
		} else if (vetorA.length % 2 != 0) {
			int a = (vetorA.length / 2) + 1 / 2;
			System.out.println("A mediana é: " + vetorA[a]);
		}

	}

	public static void desvioPadrao() {

	}

	public static void união() {
		System.out.println("Digite dois vetores: ");
		int[] vetorA = vetor();
		int[] vetorB = vetor();
		int[] vetorC = new int[vetorA.length + vetorB.length];

		int i = 0;
		for (i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];
		}
		int k = 0;
		for (int j = i; i < vetorC.length; j++) {
			vetorC[j] = vetorB[k];
			k++;
		}
		System.out.println("A união dos dois vetores é: ");
		System.out.print("[");
		for (i = 0; i < vetorC.length; i++) {
			if (i == vetorC.length - 1) {
				System.out.print(vetorC[i] + "]");
			} else {
				System.out.print(vetorC[i] + ", ");
			}
		}
	}

	public static void inversão() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[vetorB.length - i] = vetorA[i];
		}
		System.out.println("O inverso do vetor digitado é: ");
		System.out.print("[");

		for (int i = 0; i < vetorB.length; i++) {
			if (i == vetorB.length - 1) {
				System.out.print(vetorB[i] + "]");
			} else {
				System.out.print(vetorB[i] + ", ");
			}
		}
	}

	public static void interseção() {
		int[] vetorA = vetor();
		int[] vetorB = vetor();
		int[] vetorC = new int[vetorA.length + vetorB.length];
		int k = 0;
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					vetorC[k] = vetorA[i];
					k++;
				}
			}
		}
		System.out.println("A interseção dos vetores é: ");
		System.out.println(Arrays.toString(vetorC));
	}

	public static void diferentes() {
		int[] vetorA = vetor();
		int[] vetorB = vetor();
		int[] vetorC = new int[vetorA.length + vetorB.length];
		int k = 0;
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] != vetorB[j]) {
					vetorC[k++] = vetorA[i];
				}
			}
		}
		System.out.println("Os vetores diferentes são: ");
		System.out.println(Arrays.toString(vetorC));
	}

	public static void ordenação() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];

		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] < vetorA[i - 1]) {
				vetorB[i] = vetorA[i - 1];
				vetorA[i - 1] = vetorA[i];
				vetorA[i] = vetorB[i];
			}
		}
		System.out.println("O vetor em forma crescente é: ");
		System.out.println(Arrays.toString(vetorA));
	}

	public static void primos() {
		int[] vetor = vetor();
		int[] vetorB = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			int k = 0;
			int l = 0;
			for (int j = vetor[i]; j > 0; j--) {
				if (vetor[i] % j == 0) {
					k++;
				}
			}
			if (k == 2) {
				vetorB[l++] = vetor[i];
			}
		}
		System.out.println("Os numeros primos do vetor são: ");
		System.out.println(Arrays.toString(vetorB));
	}

	public static void fibonacci() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] < vetorA[i - 1]) {
				vetorB[i] = vetorA[i - 1];
				vetorA[i - 1] = vetorA[i];
				vetorA[i] = vetorB[i];
			}
		}
		int a = vetorA[vetorA.length - 1];
		int[] vetorFibo = new int[a];

		vetorFibo[0] = 1;
		vetorFibo[1] = 1;
		for (int i = 2; i < a; i++) {
			vetorFibo[i] = vetorFibo[i - 1] + vetorFibo[i - 2];
		}

		for (int i = 0; i < vetorA.length; i++) {
			int k = 0;
			for (int j = 0; j < vetorFibo.length; j++) {
				if (vetorA[i] == vetorFibo[j]) {
					vetorC[k++] = vetorA[i];
				}
			}
		}
		System.out.println("Os numeros do vetor que se encaixam na sequencia de Fibonacci são: ");
		System.out.println(Arrays.toString(vetorC));
	}

	public static void agrupamento() {
		int[] vetorA = vetor();
		int[] vetorB = new int[vetorA.length];

		for (int i = 1; i < vetorA.length; i++) {
			if (vetorA[i] < vetorA[i - 1]) {
				vetorB[i] = vetorA[i - 1];
				vetorA[i - 1] = vetorA[i];
				vetorA[i] = vetorB[i];
			}
		}

		System.out.println("Informe o agrupamento: ");
		int a = entrada();
		
		System.out.println("Os numeros agrupados em, " + a + ", estão desta forma: ");
		System.out.print("[");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i] + " ");
			if (i % a == 0) {
				System.out.print("] [");
			}
		}
		System.out.print("]");
	}
	
	public static void apresentação() {
		
		System.out.println("* * * * * Calculadora * * * * *");
		System.out.println(" ");
		System.out.println("Cada operação está enumerada de 1 a 22! ");
		System.out.println(" ");
		System.out.println("1 - Pesquisa");
		System.out.println("2 - Pesquisa por indice ");
		System.out.println("3 - Separação ");
		System.out.println("4 - Somatório ");
		System.out.println("5 - Produto ");
		System.out.println("6 - Produto Escalar ");
		System.out.println("7 - Completa com Zero ");
		System.out.println("8 - Quadrado ");
		System.out.println("9 - Média ");
		System.out.println("10 - Maximo ");
		System.out.println("11 - Minimo ");
		System.out.println("12 - Moda unimodal ");
		System.out.println("13 - Mediana ");
		System.out.println("14 - Desvio Padrão ");
		System.out.println("15 - União ");
		System.out.println("16 - Inversão ");
		System.out.println("17 - Interseção ");
		System.out.println("18 - Diferença ");
		System.out.println("19 - Ordenação ");
		System.out.println("20 - Primos ");
		System.out.println("21 - Fibonacci ");
		System.out.println("22 - Agrupamento ");
		System.out.println(" ");
		System.out.println("Digite o numero da operação: ");
		
	}
	
	public static void seleção() {
		
		int digito;
		int i = 0;
		do {
			digito = entrada();
			if (digito >= 1 && digito <= 22)
				i = 1;
		} while (i != 1);

		if (digito == 1) {
			pesquisa(vetor());
		}
		if (digito == 2) {
			pesquisaPorIndice(vetor());
		}
		if (digito == 3) {
			separação();
		}
		if (digito == 4) {
			somatório(vetor());
		}
		if (digito == 5) {
			produto(vetor());
		}
		if (digito == 6) {
			produtoEscalar();
		}
		if (digito == 7) {
			completaComZero();
		}
		if (digito == 8) {
			quadrado();
		}
		if(digito == 9) {
			media();
		}
		if (digito == 10) {
			maximo();
		}
		if (digito == 11) {
			minimo();
		}
		if (digito == 12) {
			modaUnimodal();
		}
		if (digito == 13) {
			mediana();
		}
		if (digito == 14) {
			desvioPadrao();
		}
		if (digito == 15) {
			união();
		}
		if (digito == 16) {
			inversão();
		}
		if (digito == 17) {
			interseção();
		}
		if (digito == 18) {
			diferentes();
		}
		if (digito == 19) {
			ordenação();
		}
		if (digito == 20) {
			primos();
		}
		if (digito == 21) {
			fibonacci();
		}
		if (digito == 22) {
			agrupamento();
		}
	}
	
	public static void main(String[] args) {
		
		int i = 0;
		char resposta;
		apresentação(); 
		
		do {
			seleção();
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Deseja fazer uma nova operação?(S/N)");
			resposta = entrada.next().charAt(0);
			
			if(resposta != 's' || resposta != 'S') {
				i = 0;
			}
			
		}while(i == 0);
		
	}
}