package variaveis;
import java.util.Scanner;

public class enun002{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		Double fahrenheit, celsius;
		
		System.out.println("Valor de fahrenheit:");
		
		fahrenheit = scanner.nextDouble();
		
		celsius = (fahrenheit - 32)/1.8;
		
		System.out.println("O resultado em graus celsius"+ celsius);
		
		
		
		
		
	}

}
