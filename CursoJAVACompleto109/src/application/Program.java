package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner scanner = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int numberProduct = scanner.nextInt();
		for (int i = 1; i <= numberProduct; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported? (c/u/i)");
			char response = scanner.next().charAt(0);
			System.out.print("Name: ");
			String name = scanner.next();
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			if (response == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			} else if (response == 'u') {
				System.out.print("Manufacture date: (DD/MM/YYYY)");
				Date manufactureDate = sdf.parse(scanner.next());
				productList.add(new UsedProduct(name, price, manufactureDate));
			} else if (response == 'c') {
				productList.add(new Product(name, price));
			}
		}

		System.out.println("PRICE TAGS:");
		for (Product prod : productList) {
			System.out.println(prod.priceTag());
		}

		scanner.close();
	}
}
