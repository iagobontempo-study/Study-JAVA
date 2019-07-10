package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new HashSet<>();   // LinkedHashSet usa a ordem que foi colocada
		aprovados.add("Joao");                     // TreeSet usa ordem padrao, string = alfabetica, numero = ordem normal... etc
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for (String nome : aprovados) {
			System.out.println(nome);
			
		}
		
	}
}
