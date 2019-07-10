package classe;

public class DataTest {

	public static void main(String[] args) {
		Data nascimento = new Data();
		nascimento.dia = 19;
		nascimento.mes = 10;
		nascimento.ano = 1994;
		Data casamento = new Data(12, 9, 2019);
		
		System.out.println(nascimento.formatar());	
		System.out.println(casamento.formatar());	
		
	}
}
