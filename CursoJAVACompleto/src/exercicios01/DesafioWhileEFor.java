package exercicios01;

import java.util.Scanner;

public class DesafioWhileEFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero positivo para quantidade de numeros:");
		int num = scanner.nextInt();
		
		while (num <= 0) {
			System.out.println("Digite um numero positivo para quantidade de numeros:");
			num = scanner.nextInt();
		}
		
		int maior = Integer.MIN_VALUE;
		for (int contador = 0; contador < num; contador++) {
			int valores = scanner.nextInt();
			if (valores > maior) {
				maior = valores;
			}
		}
		
		System.out.println(maior);
		
		scanner.close();
		
		
	}
}
