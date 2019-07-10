package exercicios2;

import java.util.Scanner;

public class SomaNumeroPositivosENegativosDaoResultado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = 0;
		double somaDosNumeros = 0;

		while (numero >= 0) {
			numero = scanner.nextDouble();
			if (numero >= 0) {
				somaDosNumeros += numero;
			}
		}
		scanner.close();
		System.out.println("Total = " + somaDosNumeros);
	}
}
