package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numberEmployees = scanner.nextInt();
		for (int i = 1; i <= numberEmployees; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n): ");
			char response = scanner.next().charAt(0);
			System.out.print("Name: ");
			String employeeName = scanner.next();
			System.out.print("Hours: ");
			int employeeHours = scanner.nextInt();
			System.out.println("Value per hour: ");
			double employeeValuePerHour = scanner.nextDouble();
			if (response == 'y') {
				System.out.println("Addicional charge: ");
				double additionalCharge = scanner.nextDouble();
				employeeList.add(new OutsourcedEmployee(employeeName, employeeHours, employeeValuePerHour, additionalCharge));
			} else {
				employeeList.add(new Employee(employeeName, employeeHours, employeeValuePerHour));
			}
		}
		
		System.out.println(" ");
		System.out.println("Payments: ");
		for (Employee emp : employeeList) {
			System.out.println(emp.getName() + ", $" + emp.payment());
		}
		
		scanner.close();
	}
}
