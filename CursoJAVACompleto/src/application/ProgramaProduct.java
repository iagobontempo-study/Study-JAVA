package application;

import java.util.Scanner;

import entities.Product;

public class ProgramaProduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do produto:");
		String name = scanner.next(); // variavel temporaria, que ira enviar ao NOVO PRODUCT (construtor)
		System.out.println("Digite o preco do produto:"); // depois de envia-la, ela pode ser reutilizada
		double price = scanner.nextDouble();
		System.out.println("Digite a quantidade do produto:");
		int quantity = scanner.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println(product);

		System.out.println("Digite quantos " + product.getName() + " você quer adicionar:");
		quantity = scanner.nextInt(); // posso usar o QUANTITY AQUI pois é uma variavel temporaria
		product.addProducts(quantity); // para criacao do produto na linha 17
		System.out.println(product);

		System.out.println("Digite quantos " + product.getName() + " você quer remover:");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		System.out.println(product);

		scanner.close();

	}
}
