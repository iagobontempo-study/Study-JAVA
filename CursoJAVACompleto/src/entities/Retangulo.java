package entities;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return altura + altura + largura + largura;
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);		
	}
}
