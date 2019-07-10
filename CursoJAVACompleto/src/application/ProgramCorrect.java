package application;

import java.util.Scanner;

import entities.Triangle;

public class ProgramCorrect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
			
		
		System.out.println("Digite as medidas do Triangulo 01:");
		t1.a = scanner.nextDouble();
		t1.b = scanner.nextDouble();
		t1.c = scanner.nextDouble();
		
		System.out.println("Digite as medidas do Triangulo 02:");
		t2.a = scanner.nextDouble();
		t2.b = scanner.nextDouble();
		t2.c = scanner.nextDouble();
		
		double areaT1 = t1.area();
		double areaT2 = t2.area();
		
		System.out.printf("Triangulo 01 area = %.4f\n", areaT1);
		System.out.printf("Triangulo 02 area = %.4f\n", areaT2);
		
		if(areaT1 > areaT2) {
			System.out.println("O maior triangulo é o Triangulo01 ");
		} else {
			System.out.println("O maior triangulo é o Triangulo02 ");
		}
		
		scanner.close();
		
	}
}
