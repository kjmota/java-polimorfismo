
public abstract class Desktop extends Computador {
	
	private double acessorios;

	double calculaValor() {
		return getGbMemoria()*200 + numProcessadores * 400
			+ acessorios;
		}

	public abstract int getGbMemoria();
	public abstract int getNumProcessadores();
	
	public void imprimir () {
		System.out.println("Acessórios: " + acessorios);
		System.out.println("Memória: " + getGbMemoria() + " Gb");
		System.out.println("Processadores: " + getNumProcessadores());
	}

	
}
