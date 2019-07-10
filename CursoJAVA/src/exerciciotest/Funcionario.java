package exerciciotest;

public class Funcionario {

	String nome;
	double salario;
	int idade;
	String funcao;

	Funcionario() {

	}

	Funcionario(String n, double s, int i, String f) {
		nome = n;
		salario = s;
		idade = i;
		funcao = f;

	}

	String formatar(){
		return String.format("%s | %.2f | %d| %s", nome, salario, idade, funcao);
		
	}
}
