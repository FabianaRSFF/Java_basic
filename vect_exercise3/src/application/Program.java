package application;

import java.util.Locale;
import java.util.Scanner;


import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos pessoas você vai cadastrar? ");	
		int n = sc.nextInt();
		People[] vect = new People[n];
		
		System.out.println("Digite o nome, idade e altura da 1ª pessoa: ");
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new People(name, age, height);
		}
		
		
		System.out.println("Menores de 16 anos: ");
		String name = null;
		int age = 0;
		for(int i=0; i<n; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
		}


		double sum = 0.0;
		for(int j=0; j<n; j++) {
			sum += vect[j].getHeight();
		}
	
		double avg = sum / n;
		
		
	
		System.out.printf(" %n Under 16: " + name + " , " + age );

		System.out.printf(" %n Average height:  " + avg);
			
			
		

		sc.close();
		
		
	}

	}
}


