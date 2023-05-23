package principal;
import java.util.Scanner;

import operacional.enun4;
public class Main4 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		
		enun4 objenun4 = new enun4();
		
		
		System.out.println("INFORME UM NUMERO INTEIRO ");
		objenun4.setNumero(objScanner.nextInt());
		
			if(objenun4.Variaveis() >= 1) {	
				System.out.println("O NUMERO INFORMADO É IMPAR");
		}else {
			if(objenun4.Variaveis() == 0) {
				System.out.println("O NUMERO INFORMADO É PAR");
		 }
			
		}
	
  
		
		
		
		
		
		
		
		
		
		
		
				
		
		

	}



}


