package exercicios01;

import java.util.Scanner;

public class CalculaHoraJogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inicio = scanner.nextInt();
		int fim = scanner.nextInt();

		int duracao;

		if (inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}
		
		scanner.close();
		
		System.out.println("O jogo durou: " + duracao + " horas.");
	}
}
