package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.println("Quantos elementos terá o vetor? ");
		n = sc.nextInt();
		
		
		double[] vetorR = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetorR[i] = sc.nextDouble();
		}
		
		
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vetorR[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Média: %.3f ", media);
		
	
	
		for(int i=0; i<n; i++) {
			if (vetorR[i] < media) {
				System.out.printf("Elementos abaixo da média: %.2f ", vetorR[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
