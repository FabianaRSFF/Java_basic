package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");	
		int n = sc.nextInt();
		
		int[] vect = new int[n];

		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[n] = sc.nextInt();
		}
		
		
		 System.out.println("Numeros negativos: ");
		 for(int i=0; i<n; i++) {
			 if (vect[n] < 0) {
				 System.out.println(vect[n]);
			 }
		 }
	
		
		sc.close();

	}

}