package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data:");
		System.out.print("Car model: ");
		String vehicle = scanner.nextLine();
		System.out.print("Pickup: (dd/MM/yyyy HH:ss)");
		Date start = sdf.parse(scanner.nextLine());
		System.out.print("Return: ");
		Date finish = sdf.parse(scanner.nextLine());
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(vehicle));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = scanner.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = scanner.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		
		
		
		scanner.close();
	}
	
}
