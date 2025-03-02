package vetores.e.matrizes;

import java.util.Scanner;

public class LerNumerosVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetorNumeros[] = new int[10];
		int elementosIndiceImpar[] = new int[10];
		int elementosPares[] = new int[10];
		int soma = 0;
		float media;
		int numero;

		// constroi o vetor
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			vetorNumeros[i] = numero;
			soma += vetorNumeros[i];
		}

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (i % 2 != 0) {
				elementosIndiceImpar[i] = vetorNumeros[i];
			}

			if (vetorNumeros[i] % 2 == 0) {
				elementosPares[i] = vetorNumeros[i];
			}
		}

		media = (float) soma / vetorNumeros.length;

		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 0; i < elementosIndiceImpar.length; i++) {
			if (elementosIndiceImpar[i] > 0) {
				System.out.printf("%d ", elementosIndiceImpar[i]);
			}
		}

		System.out.println("\n\nElementos pares: ");
		for (int i = 0; i < elementosPares.length; i++) {
			if (elementosPares[i] > 0) {
				System.out.printf("%d ", elementosPares[i]);
			}
		}

		System.out.println("\n\nSoma: " + soma);

		System.out.printf("\nMédia: %.2f", media);

		sc.close();

	}

}
