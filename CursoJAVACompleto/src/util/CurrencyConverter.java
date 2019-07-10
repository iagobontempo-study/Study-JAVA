package util;

public class CurrencyConverter {

	public static double IOF = 1.06; 
	
	public static double dollarToReais(double dollarPrice, double ammountDollar) {
		return dollarPrice * ammountDollar * IOF;
		
	}
}
