package exercicios01;

import java.util.Scanner;

public class EntradaDadoEPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = scanner.next();
		System.out.println("Quantos quartos tem na sua casa:");
		int quartos = scanner.nextInt();
		System.out.println("Digite o valor do produto:");
		Double preco = scanner.nextDouble();
		System.out.println("Digite seu ultimo nome, idade e altura (mesma linha):");
		String nome2 = scanner.next();
		int idade = scanner.nextInt();
		double altura = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println(nome);
		System.out.println(quartos);
		System.out.println(preco);
		System.out.println("------------");
		System.out.println(nome2);
		System.out.println(idade);
		System.out.println(altura);
		
		
	}
}
