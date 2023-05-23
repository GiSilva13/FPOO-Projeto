package principal;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nomeAluno, disciplina;
		int N1, N2, N3, N4, N5, Media;
		
		System.out.println("NOME DO ALUNO: ");
		nomeAluno = scanner.next();
		
		System.out.println("NOME DA DICIPLINA: ");
		disciplina = scanner.next();
		
		System.out.println("INFORME A NOTA 1: ");
		N1 = scanner.nextInt();
		
		System.out.println("INFORME A NOTA 2: ");
		N2 = scanner.nextInt();
		
		System.out.println("INFORME A NOTA 3: ");
		N3 = scanner.nextInt();
		
		System.out.println("INFORME A NOTA 4: ");
		N4 = scanner.nextInt();
		
		
		Media = (N1 + N2 + N3 + N4) / 4;
		
		
		
		System.out.println("nome: " + nomeAluno + " media: " + Media);
		
		
		if(Media >= 7) {
			System.out.println("APROVADO");
		}else {
			System.out.println("INFORME A NOTA 5");
			N5 = scanner.nextInt();
			
		
		Media = (N1 + N2 + N3 + N4 + N5) /5;
			
		
		
		System.out.println("nome: " + nomeAluno + " media: " + Media);
		
		if(Media >= 7) {
			System.out.println("APROVADO");
			
		}else {
			System.out.println("REPROVADO");
		}
		
		
		System.out.println("obrigado por usar nosso programa de média.");
		
		}
	
	}
	
	}



