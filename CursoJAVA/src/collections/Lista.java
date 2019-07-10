package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println("Get...");
		System.out.println(aprovados.get(1));        // é indexado, por isso tem get 
		
		System.out.println("Add...");
		System.out.println(aprovados.add("Maria"));      // pode ser adicionado elementos do mesmo tipo
		System.out.println("Size... " + aprovados.size());
		System.out.println(aprovados);
		
		System.out.println(aprovados.remove("Maria"));
		System.out.println(aprovados.remove("maria"));
		System.out.println(aprovados.size());
		System.out.println(aprovados);
		
		for (String nome : aprovados) {
			System.out.println(nome);
			
		}
	}
}
