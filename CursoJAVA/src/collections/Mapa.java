package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");

		System.out.println(aprovados.keySet()); // apenas o set (keys)
		System.out.println(aprovados.values()); // apenas os valores (lista)
		System.out.println(aprovados.entrySet()); // registro completo

		aprovados.put(3, "Beatriz"); // adiciona e substitui registro
		System.out.println(aprovados.get(3));
		System.out.println(aprovados.entrySet()); // registro completo

		System.out.println(aprovados.containsKey(4)); // checa true ou false se contem set 4
		System.out.println(aprovados.containsValue("Bia")); // checa true or false se existe lista bia

		System.out.println("Chaves...");
		for (Integer codigo : aprovados.keySet()) {
			System.out.println(codigo);
		}

		System.out.println("Valores...");
		for (String nome : aprovados.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Chaves/Valores...");
		for(Entry<Integer, String> registro:aprovados.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}

	}
}
