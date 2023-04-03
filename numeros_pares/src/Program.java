import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos números você vai digitar?  " );
		int n = sc.nextInt();
		
		int[] num = new int[n];
	
			
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextInt();
		}
		
		
	
		
		
		
		sc.close();

	}

}
