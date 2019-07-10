package exercicios;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = -13;
		int check = (a + b + c);
		
		System.out.println(check);
		System.out.println("Seu DELTA é " + (b * b - (4 * a * c)));
	}
}
