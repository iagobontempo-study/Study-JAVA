package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTV50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTV32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV50 = " + comprouTV50);
		System.out.println("TV32 = " + comprouTV32);
		
		System.out.println("\n");
		
		//Operador Unario intruso
		System.out.println("Fome = " + !comprouSorvete);
		
		
		
		
		
	}
}
