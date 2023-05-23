import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		ValorTriangulos objTriangulo = new ValorTriangulos();
		
		
		System.out.println("INFORME O VALOR 1");
		objTriangulo.setN1(objScanner.nextInt());
		
		System.out.println("INFORME O VALOR 2");
		objTriangulo.setN2(objScanner.nextInt());
		
		System.out.println("INFORME O VALOR 3");
		objTriangulo.setN3(objScanner.nextInt());
		
		
		
		objTriangulo.DescubraTriangulo1();
		
		
		

	}
	

}
