package exerciciotest;

public class ProdutosTeste {

	public static void main(String[] args) {
		Produtos dados = new Produtos();
		dados.nome = "Serra";
		dados.preco = 25.50;
		dados.marca = "Tramontina";
		
		Produtos dados2 = new Produtos("Gesso", 5.50, "Supergesso");
		
		System.out.println(dados.Formatar());
		System.out.println(dados2.Formatar());
						
		
	}
}
