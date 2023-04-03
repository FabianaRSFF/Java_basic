import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 34;
		double x = 10.3453;
		String nome = "Maria";
		int idade = 44;
		double renda = 5000.0;
		
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println(y);
		System.out.println(x);
		System.out.print("Olá Mundo!!!");
		System.out.println("Bom dia!");
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reaus %n", nome, idade, renda);
		
	}

}
