package exercicios01;

import java.util.Scanner;

public class CoordenadasXY {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o X");
		int x = scanner.nextInt();
		
		System.out.println("Digite o Y");
		int y = scanner.nextInt();
		
		if (x == 0 || y == 0) {
			System.out.println("Null");
		} else if (x >= 1 && y >= 1) {
			System.out.println("Primeiro");
		} else if (x >= 1 && y <= -1) {
			System.out.println("Segundo");
		} else if (x <= -1 && y >= 1) {
			System.out.println("Terceiro");
		} else if (x <= -1 && y <= -1) {
			System.out.println("Quarto");
		} else {
			System.out.println("ERRO");
		}
		
		scanner.close();
		
	}
}
