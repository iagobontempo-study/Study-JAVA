package exercicios2;

import java.util.Scanner;

public class ChecarSeAnoBisexto {

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano = 0;
		ano = scanner.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println(ano + " � bissexto");

			}else 
				System.out.println(ano + " n�o � bissexto");
		
		scanner.close();
		
		}
		
		
	 }


			
