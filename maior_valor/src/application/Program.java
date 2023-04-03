package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, maior, posicao;
		
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
				
		int[] vetor = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Maior valor: ");
			
		maior = vetor[0];
		posicao = 0;
		for(int i=0; i<n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
	
		System.out.printf("Maior valor: %d\n", maior);
		System.out.printf("Posição do maior valor: %d\n", posicao);
		
		sc.close();
	}

}
