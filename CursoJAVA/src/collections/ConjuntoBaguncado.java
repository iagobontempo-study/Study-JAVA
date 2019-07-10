package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("Size..." + conjunto.size());
		
		System.out.println("Remove...");
		System.out.println(conjunto.remove("a"));
		System.out.println(conjunto.remove('a'));
		System.out.println(conjunto.size());
		
		System.out.println("Contains...");
		System.out.println(conjunto.contains(10));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//conjunto.addAll(nums);           <- adicionar conjuntos 
		conjunto.retainAll(nums);  //      <- seleciona apenas a interce�ao (ou seja tem q ter nos 2 conjuntos)
		
		System.out.println("Size...");
		System.out.println(conjunto.size());
		
		conjunto.clear();   //       <- limpa conjunto
		System.out.println(conjunto.isEmpty());    //      <- checa se conjunto esta vazio
		
	}
}
