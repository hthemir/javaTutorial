public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
	private String universidade;

	public FuncionarioGraduado(String nome, String codigoFuncional, Comissao adicionalCargo, 
									String escolaEnsinoBasico, 
									String escolaEnsinoMedio,
									String universidade) {
		super(nome, codigoFuncional, adicionalCargo, escolaEnsinoBasico, escolaEnsinoMedio);
		this.universidade = universidade;
	}

	public double calcularRendaTotal() {
		double renda = super.calcularRendaTotal() * 2;
		setRendaTotal(renda);
		return renda;
	}
}