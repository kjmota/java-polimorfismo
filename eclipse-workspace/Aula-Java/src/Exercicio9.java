import java.util.Scanner;

public class Exercicio9 {

	//número primo é divisivel por 1 e ele mesmo apenas
	//número de divisores é 2 (ele e +1)
	
	public static void main(String[] args) {
		int numeroPrimo;
		int contador = 0;

		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		numeroPrimo = in.nextInt();
		
		for (int i = 1; i <= numeroPrimo; i++) {
			if (numeroPrimo % i == 0) {
				contador ++;
			}
		}
		if (contador == 2) {
			System.out.println("O número informado é primo.");
		} else {
			System.out.println("O número informado NÃO é primo.");
		}
	}
}