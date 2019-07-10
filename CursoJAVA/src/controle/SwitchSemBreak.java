package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "roxa";
		
		switch(faixa.toLowerCase()) {
		case "preta":System.out.println("Sei fazer Bassai-dai/Jion/Kanku-Dai");
		case "marrom" : System.out.println("Sei fazer Tekki Shodan");
		case "roxa":System.out.println("Sei fazer Heian Godan");
		case "verde":System.out.println("Sei fazer Heian Yondan");
		case "laranja":System.out.println("Sei fazer Heian Sadan");
		case "vermelha":System.out.println("Sei fazer Heian Nidan");
		case "amarela":System.out.println("Sei fazer Heian Shodan");
		default: System.out.println("Não sei nada");
		}
		
	}
}
