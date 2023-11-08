
public abstract class Notebook extends Computador {

	private int polegadasTela;
	
	double calculaValor() {
		return gbMemoria * 250 + numProcessadores * 500
				+ polegadasTela * 100;
		}
	
	public void imprimir () {
		System.out.println("Polegadas da tela: " + polegadasTela);
		System.out.println("Memória: " + getGbMemoria() + " Gb");
		System.out.println("Processadores: " + getNumProcessadores());
	}
}


