import java.util.Scanner;
public class loopSentinela {
	
	int n1,n2,r = 0,resultado;

	Scanner objScanner = new Scanner(System.in);
	
	public void ProgramaValores() {
		
	do {
		System.out.println("DIGITE UM NUMERO");
		n1 = objScanner.nextInt();
		
		if(n1 >= 0) {
			
			resultado = r + n1;
			r = resultado;
		
			System.out.println("O RESULTADO É: " + resultado);
		
		}
		
		
	}while(n1 >= 0 );
	System.out.println("NAO TEM COMO SOMAR ");

	
	
	}
	
	}


