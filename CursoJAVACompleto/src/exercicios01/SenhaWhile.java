package exercicios01;

import java.util.Scanner;

public class SenhaWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int senha = scanner.nextInt();
		
		while (senha != 256256) {
				System.out.println("Senha errada. Tente novamente");
				senha = scanner.nextInt();
		}

		System.out.println("Senha correta!");
		
		
		scanner.close();
	
	}
}
