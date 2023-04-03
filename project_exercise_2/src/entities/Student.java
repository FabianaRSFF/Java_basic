package entities;



public class Student {
	public String name;
	public double grade_1;
	public double grade_2;
	public double grade_3;
	
	
	public double average() {
		double average = grade_1 + grade_2 + grade_3;
		return  average;
	}
	
	
	
	public double final_grade(double average) {
		double final_grade = average;
			if (final_grade >= 60.0) {
				System.out.printf("Final grade: " + final_grade + "Pass!");
			}
			else {
				System.out.println("Final grade: " + final_grade + " %nFailed, missing " +  average);
			}
			return final_grade;
		
		
		
	}

}


