public class Conta {
	private Pessoa cliente;
	private String numeroConta;
	private double saldo;
	private double limite;
	
	public Conta(Pessoa cliente, String numeroConta, double saldo, double limite) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public boolean depositar(double quantidade) {
		if ((saldo += quantidade) > limite)
			return false;
		saldo += quantidade;
		return true;
	}
	
	public boolean sacar(double quantidade) {
		if (saldo < quantidade)
			return false;
		saldo -= quantidade;
		return true;
	}
	
	public double saldo() {
		return saldo;
	}
}