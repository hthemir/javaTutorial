public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
	private String escolaEnsinoMedio;

	public FuncionarioEnsinoMedio(String nome, String codigoFuncional, Comissao adicionalCargo, 
									String escolaEnsinoBasico, 
									String escolaEnsinoMedio) {
		super(nome, codigoFuncional, adicionalCargo, escolaEnsinoBasico);
		this.escolaEnsinoMedio = escolaEnsinoMedio;
	}

	public double calcularRendaTotal() {
		double renda = super.calcularRendaTotal() * 1.5;
		setRendaTotal(renda);
		return renda;
	}
}