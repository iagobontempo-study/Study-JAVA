package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class ProgramaFuncionarios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Funcionarios> listaFuncionarios = new ArrayList<>();

		System.out.print("Quantos funcionarios você ira cadastrar?");
		int qntFuncionarios = scanner.nextInt();

		for (int i = 1; i <= qntFuncionarios; i++) {
			System.out.println("Funcionario #" + i + ": ");
			System.out.print("ID:");
			int id = scanner.nextInt();
			System.out.print("NAME:");
			String name = scanner.next();
			System.out.print("SALARY");
			double salary = scanner.nextDouble();
			listaFuncionarios.add(new Funcionarios(id, name, salary));
		}
		
		System.out.println("Digite o ID do funcionario para aumento de salario:");
		int id = scanner.nextInt();
		Funcionarios funcionario = listaFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (funcionario == null) {
			System.out.println("Esse funcionario não existe!");
		} else {
			System.out.println("Digite a porcentagem:");
			double porcentagem = scanner.nextDouble();
			funcionario.increaseSalary(porcentagem);
		}
		
		System.out.println("Lista dos empregados");
		for (Funcionarios obj : listaFuncionarios)
			System.out.println(obj);


		scanner.close();
	}
}
