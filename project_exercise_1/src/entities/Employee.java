package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double salary() {
		double salary = grossSalary - tax;
		return salary;
			
	}
	
	public double bonus_salary() {
		double salary = grossSalary - tax;
		double bonus_salary  = salary + (10 * grossSalary /100);
		return bonus_salary;
	}
	
	
	public double new_salary(double salary, double bonus) {
		return salary + bonus;
	}

}
