package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Leonardo");  //nao usual
		nome = "Leo" + "nardo";
		
		//Alguns metodos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.substring(0, 3).toUpperCase());
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(6)); 
		System.out.println(nome.equalsIgnoreCase("leonardo"));   // comparar ignorando case
		System.out.println(nome.startsWith("Leo"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal").concat("!!"));
		
		System.out.println(nome);
		
		// Unico jeito de mudar a variavel é atribuindo novo valor para ela \/
		nome = nome.toUpperCase().substring(0, 3).concat(" é legal!");
		System.out.println(nome);
		
		
	}
	
}
