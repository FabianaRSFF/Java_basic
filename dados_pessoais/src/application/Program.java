package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtd_M, qtd_F;
		double maior, menor, f__alt_media, f_alt_total;
		
		
		System.out.println("Quantas pessoas cadastradas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] sexo = new char[n];
		
		
		for(int i=0; i<n;i++) {
			System.out.printf("Digite a altura %da pessoa : ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Digite gênero %da pessoa : ", i + 1);
			sexo[i] = sc.next().charAt(0);
			}
		
	
		menor = altura[0];
		maior = altura[0];
	
		for(int j=0; j<n;j++) {
			if(altura[j] > maior) {
				maior = altura[j];
			}
			else if(altura[j] < menor){
				menor = altura[j];
			}
		}
		
				qtd_M = 0;
				qtd_F = 0;
				f_alt_total = 0;
			for(int i=0; i<n;i++) {
				if(sexo[i] == 'M') {
					qtd_M++;
				}
				else {
					sexo[i] = 'F';
					qtd_F++;
					f_alt_total = f_alt_total + altura[i];
				}
			}
			
			f__alt_media = f_alt_total / qtd_F;
			
			

		System.out.printf("Menor altura: %.2f\n", menor);
		System.out.printf("Maior altura: %.2f\n", maior);
		System.out.printf("Media das alturas das mulheres: %.2f\n", f__alt_media);
		System.out.printf("Quantidade de homens: %d\n", qtd_M);
		
		
		
		
		sc.close();
		}
		
		
		
		
	
	}


