package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = scanner.nextInt();
			System.out.print("Holder: ");
			String holder = scanner.next();
			System.out.print("Inicial Balance: ");
			double balance = scanner.nextDouble();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = scanner.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println("Enter amount for withdraw: ");
			double withdraw = scanner.nextDouble();
			try {
				acc.withdraw(withdraw);
				System.out.println("New balance: " + acc.getBalance());
			} catch (DomainException e) {
				System.out.println("Error: " + e.getMessage());
			}
		
		} catch (InputMismatchException e) {
			System.out.println("Must be a number!");
		}
		
		scanner.close();
	}
}
	
