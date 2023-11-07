
public class Ingresso {

	public String nomeEvento;
	public double valor;
	
	public Ingresso(String nomeEvento, double valor) {
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Ingresso [nomeEvento=" + nomeEvento + ", valor=" + valor + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
