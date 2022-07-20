package principal;

import java.util.Scanner;

public class questao2 
{
	public static int frequencia() {
		int presenca;
		Scanner entradaFrequencia = new Scanner(System.in);
		System.out.println("Digite a frequência do aluno (1 a 100): ");

		presenca = entradaFrequencia.nextInt();
		if (presenca >= 75) {
			return 1;
		} else
			return 0;
	}

	public static float notasEMedia() {
		int nota1, nota2, notaFinal;
		float notaMedia = 0;

		Scanner entradaNota1 = new Scanner(System.in);
		System.out.println("Digite a nota1 do aluno (1 a 10): ");
		nota1 = entradaNota1.nextInt();

		Scanner entradaNota2 = new Scanner(System.in);
		System.out.println("Digite a nota2 do aluno (1 a 10): ");
		nota2 = entradaNota2.nextInt();

		notaMedia = (nota1 + nota2) / 2;

		if (notaMedia >= 7) {
			System.out.println("Aprovado!");
		} else if (notaMedia < 3) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aluno de Avaliaçao Final!");
			Scanner entradaNotaFinal = new Scanner(System.in);
			System.out.println("Digite a nota AF: ");
			notaFinal = entradaNotaFinal.nextInt();

			notaMedia = (nota1 + nota2 + notaFinal) / 3;
		}

		return notaMedia;
	}

	public static void main() {

		frequencia();

		if (frequencia() == 1) {
			notasEMedia();
		} else {
			System.out.println("Aluno Reprovado!");
		}
	}
}

