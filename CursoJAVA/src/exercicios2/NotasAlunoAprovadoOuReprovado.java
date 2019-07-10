package exercicios2;

import java.util.Scanner;

public class NotasAlunoAprovadoOuReprovado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		scanner.close();
	}
}
