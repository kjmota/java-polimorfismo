
public class Exercicio14 {

	public static String reverse(String nome) {
        return new StringBuilder(nome).reverse().toString();
    }
 
	public static void main(String[] args) {
		 String nome = "Karina Juliana da Mota";
		 nome = reverse (nome);
		 
		 System.out.println("Meu nome ao contrário é: " + nome);
	}
      
}
