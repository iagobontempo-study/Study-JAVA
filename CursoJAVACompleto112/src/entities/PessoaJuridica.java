package entities;

public class PessoaJuridica extends Contribuintes{

	private double numeroDeFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, double rendaAnual, double numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public double getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(double numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double imposto() {
		double somaImposto = 0;
		if (numeroDeFuncionarios <= 10) {
			somaImposto = rendaAnual * 0.16;
		}else
			somaImposto = rendaAnual * 0.14;
		return somaImposto;
	}
}
