package pacote;

public class Media {

	public static void main(String[] args) {

		int nota1 = 1;
		int nota2 = 7;
		int nota3 = 6;
		int nota4 = 2;
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		
		
		if(media > 7) {
			System.out.println(media + " Aluno Aprovado");
			
		} else if (media >= 5 && media >= 7) {
			System.out.println(media + " Aluno de Recuperação");
			
			
		}else {
			System.out.println(media + " Aluno Reprovado");
		}
		
	}

}
