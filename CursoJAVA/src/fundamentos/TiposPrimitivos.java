package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipo primitivo boolean 
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);
		
		//Tipo primitivo char (caractere)
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		//Tipo primitivo inteiro
		byte b = 127;
		short s = 32767; 
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		
		//Tipo primitivo reais (ponto flutuante)
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%f %f\n", f, d);
		
		
		
	
		
		
	}
}
