package pacote;
import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		Scanner objScanner = new Scanner(System.in);
		String c�digo;
		double total;
		double quantidade;
		double valor1 = 7.50;
		double valor2 = 9.90;
		double valor3 =  14.00;
		double valor4 = 19.99;
		
		
		System.out.println("DIGITE SEU C�DIGO: ");
		c�digo = objScanner.next();
		
		System.out.println("DIGITE A QUANTIDADE:");
		quantidade = objScanner.nextDouble();
		
		
		
		if(c�digo.equalsIgnoreCase("A001")){
			
			total = (valor1 * quantidade);
			System.out.println("O RESULTADO �: " + total);
			
			
		}
		else if(c�digo.equalsIgnoreCase("A002")){
			
			total = valor2 * quantidade;
			System.out.println("O RESULTADO �: " + total);


		}
		else if(c�digo.equalsIgnoreCase("A003")){
			
			total = valor3 * quantidade;
			System.out.println("O RESULTADO �: " + total);

			
		}
		else if(c�digo.equalsIgnoreCase("A004")){
			
			total = valor4 * quantidade;
			System.out.println("O RESULTADO �: " + total);

		}
		else {
			System.out.println("PLANO INVALIDO");
		}
		
					
			
	}	
	
	
	
	
	
	}
	
		
		

		
		
		
		

		
		

	


