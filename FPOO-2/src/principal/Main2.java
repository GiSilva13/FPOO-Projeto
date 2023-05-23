package principal;
import operacional.enun1;
import operacional.enun2;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enun2 objenun2 = new enun2();
		Scanner objScanner = new Scanner(System.in);
		//enun1_1 objenun1_1 = new enun1_1();
		
		System.out.println("INFORME O PRIMEIRO NUMERO");
		objenun2.setN1(objScanner.nextInt());
		
		System.out.println("INFORME O SEGUNDO NUMERO");
		objenun2.setN2(objScanner.nextInt());
		
		System.out.println("INFORME O TERCEIRO NUMERO");
		objenun2.setN3(objScanner.nextInt());
		
		
		
		objenun2.verificarMaior();
		
	}

}
