public class Funcionario {
	private String nome;
	private String codigoFuncional;
	private double rendaBasica = 1000.0;
	private double rendaTotal;
	private Comissao adicionalCargo;

	public Funcionario(String nome, String codigoFuncional, Comissao adicionalCargo) {
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.adicionalCargo = adicionalCargo;
	}

	public double rendaComComissao() {
		return calcularRendaTotal() + getAdicional();
	}

	public double calcularRendaTotal() {
		rendaTotal = rendaBasica;
		return rendaTotal;
	}

	public void setRendaTotal(double renda) {
		this.rendaTotal = rendaTotal;
	}

	public double getRendaTotal() {
		return rendaTotal;
	}

	public String getNome() {
		return nome;
	}

	public double getAdicional() {
		return adicionalCargo.getAdicional();
	}

	public String toString() {
		return nome + ", comissao: " + getAdicional() + ", salario total: " + rendaComComissao();
	}
}