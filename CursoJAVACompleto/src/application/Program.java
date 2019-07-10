package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double t1Area, t1Base, t1Hipo, t2Area, t2Base, t2Hipo;
		
		System.out.println("Digite as medidas do Triangulo 01:");
		t1Area = scanner.nextDouble();
		t1Base = scanner.nextDouble();
		t1Hipo = scanner.nextDouble();
		
		System.out.println("Digite as medidas do Triangulo 02:");
		t2Area = scanner.nextDouble();
		t2Base = scanner.nextDouble();
		t2Hipo = scanner.nextDouble();
		
		double p = (t1Area + t1Base + t1Hipo) / 2;
		double areaT1 = Math.sqrt(p * (p - t1Area) * (p- t1Base) * (p - t1Hipo));
		
		double p2 = (t2Area + t2Base + t2Hipo) / 2;
		double areaT2 = Math.sqrt(p2 * (p2 - t2Area) * (p2- t2Base) * (p2 - t2Hipo));
		
		System.out.printf("Triangulo 01 area = %.3f\n", areaT1);
		System.out.printf("Triangulo 02 area = %.3f\n", areaT2);
		
		if(areaT1 > areaT2) {
			System.out.println("O maior triangulo é o Triangulo01 ");
		} else {
			System.out.println("O maior triangulo é o Triangulo02 ");
		}
		
		scanner.close();
	}
}
