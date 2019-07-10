package entities;

public class PessoaFisica extends Contribuintes {
	
	private double gastosSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double somaImposto = 0;
		if (rendaAnual <= 20000) {
			if(gastosSaude > 0) {
				somaImposto = (rendaAnual * 0.15) - (gastosSaude * 0.5);
			}
		} else
			somaImposto = (rendaAnual * 0.25) - (gastosSaude * 0.5);
		return somaImposto;
	}
	

}
