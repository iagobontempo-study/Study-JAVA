package exercicios01;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char resposta;
		do {
			System.out.println("Digite um numero:");
			double num = scanner.nextInt();
			System.out.println("Raiz quadrada = " + Math.sqrt(num));
			System.out.println("Deseja continuar? y/n");
			resposta = scanner.next().charAt(0);
			
		} while (resposta != 'n');
		
		scanner.close();
	}

}