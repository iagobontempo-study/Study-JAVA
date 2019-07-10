package exercicios01;

import java.util.Scanner;

public class Funcionario04Iniciante {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero do funcionario, as horas trabalhadas e o salario por hora");
		int numero = scanner.nextInt();
		double hora = scanner.nextDouble();
		double salario = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("NUMERO DO FUNCIONARIO = " + numero);
		System.out.println("SALARIO = " + hora*salario);
	}
}
