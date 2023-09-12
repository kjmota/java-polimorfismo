
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

    	 int quantidade;
    	 
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Você terá 3 tentativas para descobrir quantos soldados os 300 espartanos"
				+ " irão enfrentar. Boa sorte!");

        do {
            System.out.print("Digite um número: ");

            quantidade = Integer.parseInt(in.nextLine());
            
            if (quantidade < 300000)
                System.out.println("Um pouco mais!");

            else if (quantidade > 300000)
                System.out.println("Um pouco menos!");
        	} while (quantidade != 300000);
        	
        	System.out.println("Parabéns! Você acertou o número de soldados que irão enfrentar os espartanos.");
    }

}