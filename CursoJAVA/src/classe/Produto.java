package classe;

public class Produto {

	String nome;
	double pre�o;
	static double desconto;
	
	Produto(){
		
	}
	
	Produto(String nome, double pre�o){
		this.nome = nome;
		this.pre�o = pre�o;
	}
	
	double produtoComDesconto(){
		return pre�o - pre�o * desconto;
	}
	
}


