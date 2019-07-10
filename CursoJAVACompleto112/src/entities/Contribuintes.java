package entities;

public abstract class Contribuintes {

	protected String nome;
	protected double rendaAnual;
	
	public Contribuintes() {
		
	}

	public Contribuintes(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double imposto();
	
}
