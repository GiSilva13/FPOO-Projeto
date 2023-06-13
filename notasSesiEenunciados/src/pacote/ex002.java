package pacote;
import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		Scanner objScanner = new Scanner(System.in);
		String código;
		double total;
		double quantidade;
		double valor1 = 7.50;
		double valor2 = 9.90;
		double valor3 =  14.00;
		double valor4 = 19.99;
		
		
		System.out.println("DIGITE SEU CÓDIGO: ");
		código = objScanner.next();
		
		System.out.println("DIGITE A QUANTIDADE:");
		quantidade = objScanner.nextDouble();
		
		
		
		if(código.equalsIgnoreCase("A001")){
			
			total = (valor1 * quantidade);
			System.out.println("O RESULTADO É: " + total);
			
			
		}
		else if(código.equalsIgnoreCase("A002")){
			
			total = valor2 * quantidade;
			System.out.println("O RESULTADO É: " + total);


		}
		else if(código.equalsIgnoreCase("A003")){
			
			total = valor3 * quantidade;
			System.out.println("O RESULTADO É: " + total);

			
		}
		else if(código.equalsIgnoreCase("A004")){
			
			total = valor4 * quantidade;
			System.out.println("O RESULTADO É: " + total);

		}
		else {
			System.out.println("PLANO INVALIDO");
		}
		
					
			
	}	
	
	
	
	
	
	}
	
		
		

		
		
		
		

		
		

	


