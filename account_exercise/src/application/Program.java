package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.print("Enter account number: ");
		int number_account = sc.nextInt();
		
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		
		System.out.println("Is there an inicial deposit(y/n)?   ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number_account, name, initialDeposit);
		}
		else {
			account = new Account(number_account, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		sc.close();

	}

}
