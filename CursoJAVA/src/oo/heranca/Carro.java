package oo.heranca;

public class Carro {

	protected int VELOCIDADE_MAXIMA = 200;
	private int velocidade_atual = 0;

	protected final void acelerarMais(int velocidade) {
		if (velocidade_atual + velocidade > VELOCIDADE_MAXIMA) {
			velocidade_atual = VELOCIDADE_MAXIMA;
		} else {
			velocidade_atual += velocidade;
		}
	}

	protected final void frearMais(int velocidade) {
		if (velocidade_atual - velocidade < 0) {
			velocidade_atual = 0;
		} else {
			velocidade_atual -= velocidade;
		}
	}

	public void acelerar() {
		acelerarMais(5);
	}

	public void frear() {
		frearMais(5);
	}

	public int getVelocidadeAtual() {
		return velocidade_atual;
	}

}
