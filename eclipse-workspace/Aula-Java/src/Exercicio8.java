import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("1 - Gestante");
		System.out.println("2 - Idoso (a)");  		
		System.out.println("3 - Deficiente");
		System.out.println("4 - nenhuma das opções anteriores");
		
		System.out.println("Digite uma das opções: ");
		int opcao = in.nextInt();
		
		if (opcao == 4) {
			System.out.println("Você NÃO tem direito ao atendimento prioritário.");
		} else {
			System.out.println("Você tem direito ao atendimento prioritário.");
		}
	
	}
}
