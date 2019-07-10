package fundamentos;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("Area igual a "  + area +  " m2");
		System.out.printf("Area igual %f m2.\n" , area);
		System.out.printf("Area igual a %.2f", area);
		
	}
}
