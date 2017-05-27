public class FuncionarioEnsinoBasico extends Funcionario {
	private String escolaEnsinoBasico;

	public FuncionarioEnsinoBasico(String nome, String codigoFuncional, Comissao adicionalCargo, String escolaEnsinoBasico) {
		super(nome, codigoFuncional, adicionalCargo);
		this.escolaEnsinoBasico = escolaEnsinoBasico;
	}

	public double calcularRendaTotal() {
		double renda = super.calcularRendaTotal() * 1.1;
		setRendaTotal(renda);
		return renda;
	}
}