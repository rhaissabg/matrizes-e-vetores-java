package vetores.e.matrizes;

import java.util.Scanner;

public class ResultadosMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int matrizNumeros[][] = new int[3][3];
		int diagonalPrincipal[] = new int[3];
		int diagonalSecundaria[] = new int[3];
		int somaPrincipal = 0, somaSecundaria = 0;
		int numero;

		for (int l = 0; l < matrizNumeros.length; l++) {
			for (int c = 0; c < matrizNumeros.length; c++) {
				System.out.printf("Digite um valor para linha %d e coluna %d: ", l, c);
				numero = sc.nextInt();

				matrizNumeros[l][c] = numero;
			}
		}

		System.out.println("\nMatriz: ");
		for (int l = 0; l < matrizNumeros.length; l++) {
			for (int c = 0; c < matrizNumeros.length; c++) {
				System.out.print(" " + matrizNumeros[l][c] + " ");
			}
			System.out.println();
		}

		System.out.println("\nDiagonal principal: ");
		for (int i = 0; i < diagonalPrincipal.length; i++) {
			diagonalPrincipal[i] = matrizNumeros[i][i];
		}

		for (int i = 0; i < diagonalPrincipal.length; i++) {
			System.out.print(diagonalPrincipal[i] + " ");
		}

		System.out.println("\n\nDiagonal secundária: ");
		int j = diagonalSecundaria.length - 1;
		for (int i = 0; i < diagonalSecundaria.length; i++) {
			diagonalSecundaria[i] = matrizNumeros[i][j];
			j--;
		}

		for (int i = 0; i < diagonalSecundaria.length; i++) {
			System.out.print(diagonalSecundaria[i] + " ");
		}

		for (int i = 0; i < diagonalPrincipal.length; i++) {
			somaPrincipal += diagonalPrincipal[i];
		}

		for (int i = 0; i < diagonalSecundaria.length; i++) {
			somaSecundaria += diagonalSecundaria[i];
		}

		System.out.println("\n\nSoma dos elementos da diagonal principal: ");
		System.out.print(somaPrincipal);

		System.out.println("\n\nSoma dos elementos da diagonal secundária: ");
		System.out.print(somaSecundaria);

		sc.close();

	}

}