package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entitites.Client;
import entitites.Order;
import entitites.OrderItem;
import entitites.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = scanner.next();
		System.out.print("Email: ");
		String clientEmail = scanner.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scanner.next());					// LEMBRAR DE USAR SDF.PARSE p/ pegar scanner
		
		Client client = new Client(clientName, clientEmail, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scanner.next());    // LEMBRAR DE USAR VALUEOF SCANNER (PARA ENUMS)
		
		Order order = new Order(new Date(), status, client);        // LEMBRAR QUE DA PARA USAR O CONSTRUTOR NA HORA DE CRIAR
																	// UMA VARIAVEL
		System.out.print("How many items to this order? ");
		int quantityItemOrder = scanner.nextInt();
		for (int i = 1; i <= quantityItemOrder; i++) {
			System.out.println("Enter "+ i + "# item data: ");
			System.out.print("Product name: ");
			String productName = scanner.next();
			System.out.print("Product price: ");
			double productPrice = scanner.nextDouble();
			
			Product product = new Product(productName, productPrice);	
			
			System.out.print("Quantity: ");
			int quantity = scanner.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);                                // ORDER (ADD) RECEBE O ORDERITEM
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println(order);
				
		
		scanner.close();
	}
}
