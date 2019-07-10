package exerciciotest;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario dados = new Funcionario();
		dados.nome = "Iago";
		dados.salario = 2500.5;
		dados.idade = 25;
		dados.funcao = "Lindo demais";	
		
		Funcionario dados2 = new Funcionario("Maria",5000.50,25,"Muito mais que linda");
		
		
		System.out.println(dados.formatar());
		System.out.println(dados2.formatar());
		
		
		
		
		
	}
}
