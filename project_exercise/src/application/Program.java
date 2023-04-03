package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter the measures of rectangle x : ");
		x.l = sc.nextDouble();
		x.L = sc.nextDouble();
		
		
		double area = x.area();
		System.out.printf("Rectangle X area: %.4f%n", area);
		
		double perimeter = x.perimeter();
		System.out.printf("Rectangle X perimeter: %.4f%n", perimeter);
		
		double diagonal = x.diagonal();
		System.out.printf("Rectangle X diagonal: %.4f%n", diagonal);
		
		sc.close();
	}

}
