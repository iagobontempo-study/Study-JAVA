package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramaLista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Alex");
		list.add("Marco");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
	    
	    System.out.println(list);
	    
	    
	}
}
