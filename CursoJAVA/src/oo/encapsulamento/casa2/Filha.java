package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido esta quase sendo demitido";

	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem..." + euMesma.segredoDoCasal);
		
		System.out.println(euMesma.segredoDeFamilia);  // HERAN�A usando extends na classe
														// possui acesso direto!
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		//Sogra mamae = new Sogra();
		//System.out.println(mamae.segredoDeFamilia);
		
		
}
}
