package exerciciotest;

public class Produtos {
	
	String nome;
	double preco;
	String marca;
	
	Produtos(){
		
	}
	
	Produtos(String n, double p, String m) {
		nome = n;
		preco = p;
		marca = m;
		
	}
	
	String Formatar() {
		return String.format("%s %.2f %s", nome, preco, marca);
		
	}

}
