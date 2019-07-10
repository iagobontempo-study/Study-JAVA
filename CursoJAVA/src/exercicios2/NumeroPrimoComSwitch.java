package exercicios2;

import java.util.Scanner;

public class NumeroPrimoComSwitch {

	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 0: System.out.println("O numero: "+ numero + " é primo");break;
		default: System.out.println("O numero: "+ numero + " não é primo");
		}
		
		
		scanner.close();

	}
}