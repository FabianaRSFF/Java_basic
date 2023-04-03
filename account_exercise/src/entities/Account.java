package entities;

public class Account {
	
	
	private int number_account;
	private String name;
	private double balance;
	

	public Account() {
		
	} 
	
	public Account(int number_account, String name) {
		this.number_account = number_account;
		this.name = name;

	}
	
	
	public Account(int number_account, String name, double initialDeposit) {
		this.number_account = number_account;
		this.name = name;
		deposit(initialDeposit);
	}
	

	public int getNumber_account() {
		return number_account;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString(){
		return "Account "
				+ number_account
				+ ", Name: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	
}
