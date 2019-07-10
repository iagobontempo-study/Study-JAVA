package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ExercicioProgram2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Digite o caminho do arquivo para leitura: ");
		String caminhoArquivo = scanner.nextLine();

		File arquivo = new File(caminhoArquivo);
		String pastaDoArquivo = arquivo.getParent();
		
		boolean success = new File(pastaDoArquivo + "\\out").mkdir();

		String saidaDoArquivo = pastaDoArquivo + "\\out\\summary-iago.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			
			String linhaProduto = br.readLine();
			while (linhaProduto != null) {
				
				String[] espacos = linhaProduto.split(",");
				String name = espacos[0];
				double price = Double.parseDouble(espacos[1]);
				int quantity = Integer.parseInt(espacos[2]);

				list.add(new Product(name, price, quantity));

				linhaProduto = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(saidaDoArquivo))) {
				
			
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(saidaDoArquivo + " CREATED!");
				
			} catch (IOException error) {
				System.out.println("Error: " + error);
			}
			
		} catch (IOException error) {
			System.out.println("Error: " + error);
		}
		
		
		scanner.close();
	}

}