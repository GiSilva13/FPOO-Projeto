package variaveis;
import java.util.Scanner;

public class enun004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double A, B, C;
		
		System.out.println("valor de A:");
		
		A = scanner.nextDouble();
		
		System.out.println("valor de B:");
		
		B = scanner.nextDouble();
		
		C = B;
		
		B = A;

		A = C;
		
		System.out.println("O resultado de A é: "+ A);
		
		System.out.println("O resultado de B é: "+ B);
		
		System.out.println("O resultado de C é:"+ C);



		
		}

}
