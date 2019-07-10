package application;

import java.util.Scanner;

import entities.Empregado;

public class ProgramaEmpregado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Empregado empregado = new Empregado();
		
		System.out.println("Digite o nome do empregado:");
		empregado.nome = scanner.nextLine();
		System.out.println("Digite o salario do empregado:");
		empregado.salario = scanner.nextDouble();
		System.out.println("Digite a taxa de imposto do empregado:");
		empregado.tax = scanner.nextDouble();
		
		
		System.out.println("Empregado: " + empregado.nome + ", R$ " + empregado.liquido());
		
		System.out.println("Você deseja aumentar o salario de " + empregado.nome + " em quantos %?");
		double aumento;
		aumento = scanner.nextDouble();
		empregado.aumentar(aumento);
		System.out.println("Empregado atualizado: " + empregado.nome + ", R$ " + empregado.liquido());
		
		scanner.close();
		
	}
}
