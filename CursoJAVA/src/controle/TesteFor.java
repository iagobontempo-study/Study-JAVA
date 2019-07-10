package controle;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double peso = 0;
		double somaPeso = 0;
		
		for(int indice = 0; indice < 4; indice++) {
			peso = scanner.nextDouble();
			somaPeso += peso;
		}
		
		scanner.close();
		System.out.printf("Media do peso é: %.2f", somaPeso / 4);
		
	}
}
