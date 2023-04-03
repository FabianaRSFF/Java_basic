package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int mais_velho, posicao;
		
		System.out.println("Quantas pessoas no cadastro? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + ( i+1) + "a pessoa: ");
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		
		mais_velho = idade[0];
		posicao = 0;
		for(int i=0; i<n; i++) {
			if(idade[i] > mais_velho) {
				mais_velho = idade[i];
				posicao = i;
				
			}
		}
		
		
		System.out.printf("Pessoa mais velha: %s\n", nome[posicao]);
		
		
		
		
		
		sc.close();

	}

}
