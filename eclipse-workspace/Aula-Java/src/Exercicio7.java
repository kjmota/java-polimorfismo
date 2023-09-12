import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		int salario;
		int idade;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite sua idade: ");
		idade = in.nextInt ();
		
		System.out.println("Digite seu salário: ");
		salario = in.nextInt();
		
		if (idade >= 18 && salario >= 2000) {
			System.out.println("Parabéns! Você pode comprar seu carro.");
		} else {
			System.out.println("Neste momento você não pode comprar seu carro. Lamento!");
		}
		
		
		
	}

}
