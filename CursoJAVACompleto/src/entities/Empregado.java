package entities;

public class Empregado {

	public String nome;
	public double salario;
	public double tax;

	public double liquido() {
		return salario - tax;
	}

	public void aumentar(double porcentagem) {
		this.salario += this.salario * porcentagem / 100;
	}
}
