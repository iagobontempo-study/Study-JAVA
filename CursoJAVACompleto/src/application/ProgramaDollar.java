package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramaDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual preco do dollar?");
		double dollarPrice = scanner.nextDouble();
		System.out.println("Quantos dollares voce ira comprar?");
		double ammountDollar = scanner.nextDouble();
		
		System.out.println("Quantidade a ser paga em reais:");
		System.out.println(CurrencyConverter.dollarToReais(dollarPrice, ammountDollar));
		
		
		scanner.close();
	}
}
