
public class Conta {
		
		private int numero;
		private String titular;
		private double saldo;
		private double limite;
		
		public int getNumero() {
			return numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public String getTitular() {
			return titular;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public double getLimite() {
			return limite;
		}
		
		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		@Override
		public String toString() {
			return "Titular da Conta: " + this.titular + ", Número: " + this.numero + ", Limite: " + this.limite + ", Saldo: " + this.saldo;
		}
		
		public boolean depositar (double valor) {
			saldo += valor;
			return false;
		}

		public boolean sacar(double valor) {
			saldo -= valor;
			return false;
			}
		}
