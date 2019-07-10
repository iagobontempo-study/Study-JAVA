package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.nome = "Notebook Acer 8GB";
		p.preço = 2500;
		
		// lembrando que funionaria se eu removesse esse Produto.desconto e modificasse na 
		// classe que tem as variaveis "static double desconto = 0.15;"
		
		Produto.desconto = 0.15;
		
		System.out.println(p.produtoComDesconto());
		
		Produto produto2 = new Produto("Notebook Samsung 8GB", 2600);
		System.out.println(produto2.produtoComDesconto());
		
				
				
}
}