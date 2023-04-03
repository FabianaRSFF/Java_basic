package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		System.out.println("Enter employee data: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Enter employee gross salary: ");
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Enter employee taxs: ");
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		double salary = employee.salary();
		System.out.printf("Your salary is: %.2f%n", salary);
		
		
		double bonus_salary = employee.bonus_salary();
		System.out.printf("Your bonus is: %.2f%n", bonus_salary);
		
		
		double new_salary = employee.new_salary(salary, bonus_salary);
		System.out.printf("Congratulations your new salary is now increased in ten percent", new_salary);
		
		
		
		
		
		sc.close();
	}

}
