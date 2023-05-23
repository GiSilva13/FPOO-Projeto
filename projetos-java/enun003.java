package variaveis;
import java.util.Scanner;
public class enun003 {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	double tempo, velocidade, distancia, litros;
	
	System.out.println("Valor do tempo:");
	tempo = scanner.nextDouble();
	
	System.out.println("Valor da velocidade:");
	velocidade = scanner.nextDouble();
	
	distancia = (tempo * velocidade);
	
	System.out.println("O resultado de distancia é " + distancia);
	 
	litros = (distancia/12);
	
	System.out.println("O resultado de ltros é " + litros);

	
	
	
	}
	
	
}
