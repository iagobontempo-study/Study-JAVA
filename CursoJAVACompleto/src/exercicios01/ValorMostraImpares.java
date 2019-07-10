package exercicios01;

import java.util.Scanner;

public class ValorMostraImpares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int num = scanner.nextInt();
		
		for (int i = 1; i < num; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
			
		}
		
		scanner.close();
		
	}
}
