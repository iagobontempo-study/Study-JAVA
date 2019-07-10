package application;

import java.util.Scanner;

import entities.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.nome = scanner.nextLine();
		System.out.println("Digite a nota 1:");
		aluno.nota1 = scanner.nextDouble();
		System.out.println("Digite a nota 2:");
		aluno.nota2 = scanner.nextDouble();
		System.out.println("Digite a nota 3:");
		aluno.nota3 = scanner.nextDouble();
		
		System.out.println("NOTA FINAL = " + aluno.totalNotas());
		if (aluno.totalNotas() >= 60) {
			System.out.println("PASSOU!");
		}else if (aluno.totalNotas() <= 60) {
			System.out.println("REPROVOU!");
			System.out.println("Faltaram: " + (60 - aluno.totalNotas()) + " pontos.");
		}
		
		scanner.close();
		
	}
}
