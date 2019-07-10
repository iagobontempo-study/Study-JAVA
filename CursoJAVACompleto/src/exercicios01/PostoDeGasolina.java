package exercicios01;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Digite o tipo de combustivel \n  1.Álcool 2.Gasolina 3.Diesel 4.Fim");

		int tipo = scanner.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			} else if (tipo == 2) {
				gasolina++;
			} else if (tipo == 3) {
				diesel++;
			}
			tipo = scanner.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		scanner.close();
		
	}
}
