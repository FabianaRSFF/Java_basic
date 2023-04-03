package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductWithName;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProductWithName p = new ProductWithName();
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		ProductWithName productwithname = new ProductWithName(name, price);
		
		productwithname.setName("Computer");
		System.out.println("Updated name: " + productwithname.getName());
		productwithname.setPrice(1200.00);
		System.out.println("Updated price: " + productwithname.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: " + productwithname);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		productwithname.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + productwithname);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		productwithname.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + productwithname);
		
		sc.close();

	}

}
