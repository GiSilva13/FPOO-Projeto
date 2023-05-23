package principal;
import java.util.Scanner;
import operacional.enun5;

public class Main5 {

	public static void main(String[] args) {

	Scanner objScanner = new Scanner(System.in);
	enun5 objenun5 = new enun5();
	Calculadora objCalculadora = new Calculadora();
	
	System.out.println("INFORME O PRIMEIRO NUMERO");
	objenun5.setN1(objScanner.nextInt());
	
	System.out.println("INFORME O SEGUNDO NUMERO");
	objenun5.setN2(objScanner.nextInt());
	
	
	System.out.println("INFORME UM OPERADOR ENTRE: +, -, * E / ");
	objenun5.setOp(objScanner.next());
	
	objenun5.Calculadora();
	
	System.out.println("O RESULTADO É " + objenun5.getR());
	
	}

}
