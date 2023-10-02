import java.util.Scanner;

public class ResultadoMedia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = in.nextDouble();
		
		double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
        	System.out.println("Parabéns! O aluno foi aprovado!");
        } else if (media < 7.0) {
        	double notaQueFalta = 7.0 - media;
            System.out.println("Infelizmente o aluno encontra-se em recuperação, necessita mais " + notaQueFalta + " pontos para ser aprovado.");
        } else {
            System.out.println("Lamento, mas o aluno foi reprovado!");
        }
        
        System.out.println("------------------");
        System.out.println("Informe número de faltas do aluno durante o semestre: ");
        int faltas = 0;
        faltas = in.nextInt();
        
        if (faltas > 7) {
        	System.out.println("Aluno reprovado por excesso de faltas.");
        } else {
        	System.out.println("Aluno aprovado.");

    	}    
        
        in.close();
        
         }
}

