	
public class Exercicio5 {

	public static void main(String[] args) {
		int hora;
		int minutos;
		int segundos;
		int passado;
		int quantoTempoFalta;
		
		hora = 9;
		minutos = 05;
		segundos = 00;
		
		passado = segundos + minutos *60 + hora *3600;
		quantoTempoFalta = 86400 - passado;
		
		System.out.println("Já se passaram " + passado + " segundos desde o início do dia");
		System.out.println("Faltam " + quantoTempoFalta + " segundos para terminar o dia.");
	}
}
