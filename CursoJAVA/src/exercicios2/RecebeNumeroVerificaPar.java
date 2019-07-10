package exercicios2;

import java.util.Scanner;

public class RecebeNumeroVerificaPar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		numero = scanner.nextInt();
		String resposta = "";
		
		switch(numero) {
		
		case 10:case 8:case 6:case 4:case 2: resposta = "par";break;
		case 9: case 7: case 5: case 3: case 1: resposta = "impar";break;
		
		}
		
		scanner.close();
		
		if(resposta == "par" ) {
			System.out.println(numero + " é PAR");
		} else if (resposta == "impar") {
			System.out.println(numero + " é IMPAR");
		}else 
			System.out.println("Digite numero valido");
			
}
}
