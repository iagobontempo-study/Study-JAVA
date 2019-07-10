package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.offer("Maria");
		fila.offer("Joao");     // offer adiociona igual .add. mas nao gera erro na falha. caso falhe gera Boolean
		fila.add("Pedro");
		
		System.out.println("Peek/Element...");    // apenas checa 
		System.out.println(fila.peek());          // retorna null
		System.out.println(fila.element());        // retorna erro
		
		System.out.println("Poll/remove");   // esta printando e removendo \/
		System.out.println(fila.poll());    // ele retorna o nome de quem remove
		System.out.println(fila.remove());  // POLL retorna null se nao tem mais fila, remove retorna ERRO
		System.out.println("Agora a fila tem apenas o" + fila);	
		System.out.println(fila.poll());   
		System.out.println(fila.poll());  
		System.out.println(fila.remove());
		
	}
}
