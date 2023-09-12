import java.util.Scanner;

public class Exercicio3 extends SomandoMedia {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SomandoMedia somaMedia = new SomandoMedia();


        System.out.print("Digite o primeiro número: ");
        somaMedia.setNumero1 (in.nextFloat());
        System.out.println();

        System.out.print("Digite o segundo número: ");
        somaMedia.setNumero2 (in.nextFloat());
        System.out.println();

        System.out.print("Digite o terceiro número: ");
        somaMedia.setNumero3 (in.nextFloat());
        System.out.println();


        System.out.println("O maior número é: " + somaMedia.encontraMaiorNumero());
        System.out.println("O menor número é: " + somaMedia.encontraMenorNumero());
        System.out.println("A média destes números é: "+ somaMedia.getMedia());
    }
}


