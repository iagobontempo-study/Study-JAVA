package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramaBanco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.println("Digite o numero da conta:");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Digite o nome do titular:");
		String nomeTitular = scanner.next();
		
		System.out.println("Existe um deposito inicial? (y/n)");
		char resposta = scanner.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Digite a quantidade do deposito inicial:");
			double depositoInicial = scanner.nextDouble();
			conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
		} else {
			conta = new ContaBancaria(numeroConta, nomeTitular);
		}
		
		System.out.println(conta);
		
		System.out.println("Digite um valor para deposito:");
		double valorDeposito = scanner.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println(conta);
		
		System.out.println("Digite um valor para saque:");
		double valorSaque = scanner.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println(conta);
		
		
		scanner.close();
	}
}
