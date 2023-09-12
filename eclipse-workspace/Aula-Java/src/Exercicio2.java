import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe dois números:");
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		System.out.println("Os números informados foram:" + num1 + " e " + num2);
	}

}
