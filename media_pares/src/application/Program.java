package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, soma = 0, pares = 0;
		double media;
		

		int counted, index;

		
		System.out.println("Quantos elementos? ");
		counted = sc.nextInt();
		
		int[] num = new int[counted];
		
	
		
		for(index=0;index<counted;index++) {
			System.out.println("Digite um número: ");
			num[index] = sc.nextInt();
		}

		
		for(index=0;index<counted;index++) {
			if(num[index] % 2 == 0) {
				soma = soma + num[index];
				pares++;
			}
		}
			
		if(pares == 0) {
			System.out.println("Nenhum número par.");
		}
		else {
			media = (double) soma / pares;
			System.out.printf("Media dos pares: %.1f\n", media);
		}
			


		sc.close();


		
	
	}

}

