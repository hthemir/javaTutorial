public class ContaCorrente {
	private String agencia;
	private int numero;
	private String nome;
	private String cpf;
	private double saldo;

	public ContaCorrente(String agencia, int numero, String nome, String cpf, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public boolean equals(Object obj) {
		if (obj instanceof ContaCorrente && 
				((ContaCorrente)obj).getAgencia().equals(this.getAgencia()) &&
				((ContaCorrente)obj).getNumero()==(this.getNumero())) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return numero;
	}

	public String toString() {
		return ("Nome: " + nome +
				", agencia: " + agencia +
				", numero: " + numero +
				", saldo: " + saldo);
	}
}