package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.println("Digite o numero de pagantes de impostos: ");
		int numeroPagantes = scanner.nextInt();
		for (int i = 1; i <= numeroPagantes; i++) {
			System.out.print("Pessoa fisica ou juridica? (f/j)");
			char resposta = scanner.next().charAt(0);
			System.out.print("Name: ");
			String nome = scanner.next();
			System.out.print("Renda anual: ");
			double rendaAnual = scanner.nextDouble();
			if (resposta == 'f') {
				System.out.print("Gastos com saude: ");
				double gastosSaude = scanner.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));		
			} else if (resposta == 'j') {
				System.out.print("Numero de empregados: ");
				int numeroDeFuncionarios = scanner.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
			}
		}
		
		System.out.println("IMPOSTOS PAGOS: ");
		for (Contribuintes contribuintes : list) {
			System.out.printf("%s: %.2f \n", contribuintes.getNome(), contribuintes.imposto());
		}
		
		
		scanner.close();
	}
}
