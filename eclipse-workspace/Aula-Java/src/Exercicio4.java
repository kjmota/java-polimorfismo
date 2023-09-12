import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		double salarioMinimo;
		double seuSalario;
		double quantidadeDeSalarios;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o salário mínimo: ");
		salarioMinimo = in.nextDouble();
		
		System.out.println("Digite seu salário: ");
		seuSalario = in.nextDouble();
		
		quantidadeDeSalarios = seuSalario/salarioMinimo;
		
		if (seuSalario > salarioMinimo) {
			System.out.println((int) quantidadeDeSalarios + "Salário Mínimo = R$ " + (seuSalario - salarioMinimo));
		} else {
			System.out.println("Faltam R$ " + ((seuSalario - salarioMinimo) * -1) + "para você alcançar o salário mínimo");
		}
	}
}
