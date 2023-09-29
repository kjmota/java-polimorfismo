import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {
	
		System.out.println("Média Ponderada");
		System.out.println("----------");
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = in.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = in.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = in.nextDouble();
		
		double mediaPonderada;
	
		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 4) / 9;
		System.out.println("A média Ponderada é: " + Math.round(mediaPonderada));
		System.out.println("----------");
		
		double mediaAritmetica;
		
		System.out.println("Média Aritmética");
		System.out.println("----------");
		
		System.out.println("Digite a primeira nota: ");
		double primeiraNota = in.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double segundaNota = in.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double terceiraNota = in.nextDouble();
		
		mediaAritmetica = (primeiraNota + segundaNota + terceiraNota) / 3;
		System.out.println("A média aritmética é: " + Math.round(mediaAritmetica));
		
		in.close();
	}

}
