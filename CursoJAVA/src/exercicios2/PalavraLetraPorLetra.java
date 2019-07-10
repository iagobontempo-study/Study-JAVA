package exercicios2;

import javax.swing.JOptionPane;

public class PalavraLetraPorLetra {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

	}
}
