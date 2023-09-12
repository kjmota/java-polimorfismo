import java.util.Scanner;

public class Exercicio12 extends Calculadora {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int opcao;
		int operacao;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número:");
		numero1 = in.nextInt();
		
		System.out.println("Informe o segundo número:");
		numero2 = in.nextInt();
		
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		System.out.println("Digite uma das opções: ");
		opcao = in.nextInt();
		
		Calculadora calc = new Calculadora ();
		
		if (opcao == 1) {
			operacao = calc.soma (numero1, numero2);
			System.out.println("A soma dos números é: " + operacao);
  		}
		
  	 	if (opcao == 2) {
  	 		operacao = calc.subtracao (numero1, numero2);
			System.out.println("A subtração dos números é: " + operacao);
  	 	}
	    	 	
  	 	if (opcao == 3) {
  	 		operacao = calc.multiplicacao (numero1, numero2);
			System.out.println("A multiplicação dos números é: " + operacao);
		}
	   
  	 	if (opcao == 4) {
  	 		operacao = calc.divisao (numero1, numero2);
			System.out.println("A divisão dos números é: " + operacao);
		}
	}
}
