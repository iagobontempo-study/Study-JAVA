package entities;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTilular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTilular = nomeTitular;
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTilular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTilular() {
		return nomeTilular;
	}

	public void setNomeTilular(String nomeTilular) {
		this.nomeTilular = nomeTilular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque + 5;
	}
	
	public String toString() {
		return "Informacões da conta: \n" 
				+ "Numero da conta: "
				+ getNumeroConta()
				+ "\n"
				+"Nome do Titular: "
				+ getNomeTilular()
				+ "\n"
				+"Saldo: "
				+ getSaldo();
	}
	
	
}
