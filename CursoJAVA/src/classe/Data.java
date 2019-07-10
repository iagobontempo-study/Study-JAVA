package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	//ABAIXO CONSTRUTOR PADRAO DATA()
	Data() {
		
	}
	
	//ABAIXO CONSTRUITOR COM PARAMETROS
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
			}
}
