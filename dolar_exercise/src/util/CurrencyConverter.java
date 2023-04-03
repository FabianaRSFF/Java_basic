package util;

public class CurrencyConverter {
		

	public static double amount(double dolar_price, double dolar_bought) {
		double amount = dolar_price * dolar_bought;
		return amount;
		
	    }
	
	public static double amount_iof(double dolar_price, double dolar_bought) {
		double amount_iof =  0.06 * dolar_price * dolar_bought + dolar_price * dolar_bought;
		return  amount_iof;
	}
	
}
 


