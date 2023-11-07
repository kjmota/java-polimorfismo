
public class IngressoVip extends Ingresso {

	public double adicional;
	
	public IngressoVip(String nomeEvento, double valor) {
		super(nomeEvento, valor);
		
	}

	@Override
	public String toString() {
		return "IngressoVip [adicional=" + adicional + ", nomeEvento=" + nomeEvento + ", valor=" + valor
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
