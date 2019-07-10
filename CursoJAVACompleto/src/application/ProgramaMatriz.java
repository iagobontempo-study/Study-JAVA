package application;

import java.util.Scanner;

public class ProgramaMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero = scanner.nextInt();
		int[][] matriz = new int[numero][numero];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scanner.nextInt();
			}

		}

		System.out.println("Diagonal");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i] + " ");
			
		}
		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
				
			}
			
		}
		
		System.out.println("Numero negativos " + count);

		scanner.close();
	}
}
