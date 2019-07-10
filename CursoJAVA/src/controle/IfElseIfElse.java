package controle;

public class IfElseIfElse {

	public static void main(String[] args) {
		double nota = 8;
		
		if(nota >= 9) {
			System.out.println("Quadro de Honra");
		}else if (nota >= 7) {
			System.out.println("Quadro da Media");
		}else if (nota >= 4) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
}
