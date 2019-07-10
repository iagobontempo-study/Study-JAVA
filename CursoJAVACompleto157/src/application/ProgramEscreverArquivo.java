package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramEscreverArquivo {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\Iago\\Desktop\\Curso Java\\workspace\\CursoJAVACompleto157\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException error) {
			System.out.println("Error: " + error.getMessage());
		}
				
				
		
	}
}
