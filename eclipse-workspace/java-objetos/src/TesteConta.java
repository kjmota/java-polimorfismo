
public class TesteConta extends Conta {

	public static void main(String[] args) {

		Conta conta = new Conta ();
		conta.setTitular("Karina da Mota");
		conta.setNumero(1111);
		conta.setSaldo(2500.90);
		
		System.out.println(conta);
		System.out.println("-----------");
		
		conta.depositar(2900);
		System.out.println("Novo depósito. Saldo disponível: R$ " + conta.getSaldo());
		System.out.println("-----------");
		
		realizarSaque(conta, 6200);
	}

	private static void realizarSaque(Conta conta, double valor) {
		if (conta.sacar (valor)) {
			System.out.println("Saque realizado com sucesso. Saldo da conta: R$ " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para transação." + " R$: " + conta.getSaldo());
		}
		
	}

}
