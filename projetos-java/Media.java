package variaveis;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nomeAluno, disciplina;
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("===-=-=-=-=-");
		
		System.out.println("NOME DO ALUNO: ");
		nomeAluno = scanner.next();
		
		System.out.println("NOME DA DICIPLINA: ");
		disciplina = scanner.next();
		
		System.out.println("INFORME A NOTA 1: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("INFORME A NOTA 2: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("INFORME A NOTA 3: ");
		nota3 = scanner.nextDouble();
		
		System.out.println("INFORME A NOTA 4: ");
		nota4 = scanner.nextDouble();
	
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("nome: " + nomeAluno + "media: " + media);
		
		System.out.println("obrigado por usar nosso programa de m�dia.");
	}

}
