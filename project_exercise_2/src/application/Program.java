package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter student data: ");
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.print("Grade 1: ");
		student.grade_1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.grade_2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		student.grade_3 = sc.nextDouble();
		
		
		double average = student.average();
		double finaL_grade = student.final_grade(average);
		System.out.println();
		
		sc.close();
	}

}
