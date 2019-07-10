package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangule;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Shape> shapeList = new ArrayList<>();

		System.out.print("Enter the number of shapes:");
		int numberShapes = scanner.nextInt();
		for (int i = 1; i <= numberShapes; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.println("Rectangle or Circle? (r/c)");
			char response = scanner.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED)");
			Color color = Color.valueOf(scanner.next());
			if (response == 'r') {
				System.out.print("Width: ");
				double width = scanner.nextDouble();
				System.out.println("Height: ");
				double height = scanner.nextDouble();
				shapeList.add(new Rectangule(width, height));
			} else if (response == 'c') {
				System.out.println("Radius: ");
				double radius = scanner.nextDouble();
				shapeList.add(new Circle(radius));
			}
		}
		
		System.out.println("SHAPE AREA: ");
		for (Shape sha : shapeList) {
			System.out.printf("%.2f \n", sha.area());
			
		}
		
		scanner.close();
	}
}
