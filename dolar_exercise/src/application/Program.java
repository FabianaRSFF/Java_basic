package application;


import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dolar price? ");
		double dolar_price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double dolar_bought = sc.nextDouble();
		
		
		double amount = CurrencyConverter.amount(dolar_price, dolar_bought);
		double amount_iof = CurrencyConverter.amount_iof(dolar_price, dolar_bought);
		
		System.out.printf("Total = " + amount);
		System.out.printf("%nAmount to be paid in reals:  " + amount_iof);
		
		sc.close();
		
	}

}
