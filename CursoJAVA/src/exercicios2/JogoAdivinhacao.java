package exercicios2;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		int numeroEscolhido = 66;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 100:");


			for (int i = 1; i < 11; i++) {
			int entrada = scanner.nextInt();
			if (entrada == numeroEscolhido) {
				System.out.println("\nVOCÊ ACERTOU!! Total de tentativas: " + i);
			}else if (entrada >= 101) {
				System.out.println("Digite um numero menor que 100");
				i--;
			}else if (entrada <= 66) {
				System.out.println("Tentativa " + i + " o numero é maior que " + entrada);
			}else if (entrada >= 66) {
				System.out.println("Tentativa " + i + " o numero é menor que " + entrada);
		}
	}
			scanner.close();
}
}

