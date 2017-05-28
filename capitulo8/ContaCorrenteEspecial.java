public class ContaCorrenteEspecial extends ContaCorrente {
	private double limiteExtra;
	private double chequeEspecial;

	public ContaCorrenteEspecial(double saldoTotal, double limiteExtra, double chequeEspecial) {
		super(saldoTotal);
		this.limiteExtra = limiteExtra;
		this.chequeEspecial = chequeEspecial;
	}

	public double sacar(double saque) {
		if (saque > obterSaldo()) {
			double saqueAux = saque;
			saqueAux -= obterSaldo();
			if ((chequeEspecial - saqueAux)<0.0) {
				throw new EstouroContaCorrenteException("limite extrapolado");
			} else {
				setSaldoTotal(0);
				chequeEspecial -= saqueAux;
			}
		} else {
			setSaldoTotal(obterSaldo() - saque);
		}
		return saque;
	}

	public void depositar(double deposito) {
		if (chequeEspecial < limiteExtra) {
			if (chequeEspecial + deposito > limiteExtra) {
				double aux = chequeEspecial + deposito - limiteExtra;
				chequeEspecial = limiteExtra;
				setSaldoTotal(obterSaldo() + aux);
			} else {
				chequeEspecial += deposito;
			}
		} else {
			setSaldoTotal(obterSaldo() + deposito);
		}
	}

	public String toString() {
		return (
			"saldo: " + obterSaldo() +
			"\nchequeEspecial: " + chequeEspecial
			); 
	}
}