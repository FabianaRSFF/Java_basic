import java.util.Locale;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou:" + x);
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou:" + y);
		Locale.setDefault(Locale.US);
		double z;
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z);
		double w;
		w = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", w);
		char q;
		q = sc.next().charAt(0);
		System.out.println("Você digitou:" + q);
		
		
	
	}

}
