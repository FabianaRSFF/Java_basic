import java.util.Scanner;

public class Condicional_ternaria {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual o preço?" );
		double preco;
		preco = sc.nextDouble();
		
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		preco = (preco - desconto);
		System.out.printf("O desconto é : " + desconto + "%n");
		System.out.printf("O preço é : " + preco);
		
		sc.close();
		

	}

}
