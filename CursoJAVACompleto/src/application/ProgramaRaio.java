package application;

import java.util.Scanner;

import util.Calculadora;

public class ProgramaRaio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio:");
		double raio = scanner.nextDouble();
		
		System.out.println("Circunferencia: " + Calculadora.circunferencia(raio));	
		System.out.println("Volume: " + Calculadora.volume(raio));	
		System.out.println("PI: " + Calculadora.PI);  // se o metodo ou atributo for static, não precisa
													  // instancia-lo. criar um objeto.
		scanner.close();
			
			
		
		
		
	}
}

