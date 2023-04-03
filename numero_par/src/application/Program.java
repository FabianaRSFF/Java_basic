package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, total_pares;
		
		System.out.println("Quantos números você vai digitar?  " );
		n = sc.nextInt();
		
		int[] num = new int[n];
	
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("Números pares: ");
		
		total_pares = 0;
		for(int i=0; i<n; i++) {
			if(num[i] % 2 == 0) {
				System.out.printf("%d ", num[i]);
			total_pares++;
			}
		}
		

		
		
		System.out.printf("\n\nTotal de pares: %d\n ", total_pares);
				
				
				
				
		sc.close();
				
				
	}

}
