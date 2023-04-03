package entities;

public class Rectangle {
	public double L;
	public double l;
	
	
	public double area() {
		return  (L * l);
		
		
	}
	public double perimeter() {
		return ((2*L) + (2*l));

	}
	
	public double diagonal() {
		double d = ((L*L) + (l*l));
		return Math.sqrt(d);
		
	}
}
