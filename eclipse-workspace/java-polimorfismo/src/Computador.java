
public abstract class Computador implements Imprimivel {

	protected int gbMemoria;
	protected int numProcessadores;

	protected int getGbMemoria() {
		return gbMemoria;
	}

	public void setGbMemoria(int gbMemoria) {
		this.gbMemoria = gbMemoria;
	}

	public int getNumProcessadores() {
		return numProcessadores;
	}

	public void setNumProcessadores(int numProcessadores) {
		this.numProcessadores = numProcessadores;
	}
	
	
}
