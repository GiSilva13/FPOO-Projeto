package principal;
import operacional.enun1;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		enun1 objenun1 = new enun1();
		Scanner objScanner = new Scanner(System.in);
		//enun1_1 objenun1_1 = new enun1_1();
		
		System.out.println("INFORME O PRIMEIRO NUMERO");
		objenun1.setN1(objScanner.nextDouble());
		
		System.out.println("INFORME O SEGUNDO NUMERO");
		objenun1.setN2(objScanner.nextDouble());
		
		objenun1.exibirMaior();
		
	
		
	}
	
}








