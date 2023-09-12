import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println ("Digite seu nome:");
		String nome = in.nextLine();
		
		System.out.println("Seja bem-vindo: " + nome);
	}

}
