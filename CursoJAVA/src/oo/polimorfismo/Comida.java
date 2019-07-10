package oo.polimorfismo;

/**
 * @author Iago
 *
 */
public class Comida {

	/**
	 * PESO EM KILO
	 *
	 */
	private double peso = 0;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}
}
