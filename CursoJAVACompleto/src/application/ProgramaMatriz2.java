package application;

import java.util.Scanner;

public class ProgramaMatriz2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int linha = scanner.nextInt();
		int coluna = scanner.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Numero para achar:");
		int numero = scanner.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					System.out.println("Posicao: " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}

				}
			}
		}

		scanner.close();
	}

}
