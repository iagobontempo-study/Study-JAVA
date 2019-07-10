package exercicios01;

import java.util.Scanner;

public class SomaDosValoresDigitados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaDasNotas = 0;
		System.out.println("Quantas notas você irá digitar?");
		int qntDeNotas = scanner.nextInt();
		
		for (int indice = 0; indice < qntDeNotas; indice++) {
			int notas = scanner.nextInt();	
			somaDasNotas += notas;			
		}
		
		System.out.println("TOTAL = " + somaDasNotas);
		
		scanner.close();
	}
}
