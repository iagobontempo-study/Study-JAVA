package application;

import java.util.Scanner;

import entities.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura e largura do retangulo:");
		retangulo.altura = scanner.nextDouble();
		retangulo.largura = scanner.nextDouble();
		
		System.out.println(retangulo.area());
		System.out.println(retangulo.diagonal());
		
		scanner.close();
	}

}
