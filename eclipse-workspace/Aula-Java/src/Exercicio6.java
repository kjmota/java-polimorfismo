import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int idade; 
		
		System.out.println("Informe sua idade: ");
		idade = in.nextInt ();

		if (idade < 16) {
			System.out.println("Você ainda não pode votar.");
		} else if ((idade >= 18) && (idade <= 65)) {
			System.out.println("Seu voto é obrigatório.");
		} else {
			System.out.println("Seu voto é facultativo.");
		}
	}

}
