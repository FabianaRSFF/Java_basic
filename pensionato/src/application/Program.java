package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n, quarto_ocupado;
		
		
		
		System.out.println("How many rooms will be rented? ");
		n = sc.nextInt();
			
	
		String[] nome= new String[n];
		String[] email= new String[n];
		int[] quarto_escolhido = new int[n];
		

		for(int i=0;i<n;i++) {
			System.out.println("Check-in " + ( i+1) + " student:");
			System.out.println("Name:  ");
			nome[i]=sc.next();
			System.out.println("Email: ");
			email[i]=sc.next();
			System.out.println("Room: ");
			quarto_escolhido[i]=sc.nextInt();
	
		}
		
		
		quarto_ocupado = 0;
		for(int i=0;i<n;i++) {
			if(quarto_escolhido[i]!= quarto_ocupado) {
				System.out.printf(nome[i], email[i], quarto_escolhido[i]);
			}
			else {
				quarto_escolhido[i]=quarto_ocupado;
				System.out.println("Escolher outro quarto.");
			}
			
		}

		sc.close();
			
		}
			
			}
		
		
		
		
		



