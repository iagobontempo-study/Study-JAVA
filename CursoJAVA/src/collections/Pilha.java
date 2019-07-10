package collections;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		pilha.push("O pequeno principe");
		pilha.push("O hobbit");
		pilha.push("Dom Quixote");
		
		System.out.println("Peek...");    // checa proximo da pilha
		System.out.println(pilha.peek());
		
		System.out.println("Pop..."); 
		System.out.println(pilha.pop());   // imprime e remove o item da fila
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
		
	}
}
