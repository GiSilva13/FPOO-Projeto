package pacote;

import java.util.Scanner;


public class ex001 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	Scanner objScanner = new Scanner(System.in);
	String planos;
	
	System.out.println("DIGITE SEU PLANO: ");
	
	planos = objScanner.next();
	

	if(planos.equalsIgnoreCase("Básico")){
		System.out.println("valor R$150,00");
	}
	else if(planos.equalsIgnoreCase("Bronze")){
		System.out.println("valor R$220,00");
	}
	else if(planos.equalsIgnoreCase("Prata")){
		System.out.println("valor R$310,00"); 
		
	}
	else if(planos.equalsIgnoreCase("Ouro")){
		System.out.println("valor R$450,00");
	}
	
	else {
		System.out.println("PLANO INVALIDO");
	}
		
		
		
	}
	

}

