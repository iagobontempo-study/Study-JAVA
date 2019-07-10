package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double somaDasNotas = 0;
		int numeroDeNotas = 0;
		
		do { 
			nota = scanner.nextDouble();
			if (nota <= 10 && nota >=0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}
		} while (nota != -1);
		scanner.close();
		System.out.printf("Sua media �: %.2f", somaDasNotas / numeroDeNotas );
		
	}
	
}
