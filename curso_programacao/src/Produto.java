

import java.util.Locale;

public class Produto {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n %s, which price is $" + price1 + "%n %s, which price is $" + price2,
							product1, product2);
		System.out.printf("%n Record: %d years old, code %d and gender %c",
							age, code, gender);
		System.out.printf("%n Measure with eight decimal places:"+ measure+ "%n Rounded (three decimal places): %.3f %n ", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
