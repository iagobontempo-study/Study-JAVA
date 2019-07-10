package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Pessoa pessoa = new Pessoa(80.7);
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		
		pessoa.getPeso();
		
		System.out.println(pessoa.getPeso());
		
		
		
		}

		
}
