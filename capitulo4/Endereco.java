public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String cep;
	private String telefone;

	public Endereco(String estado, String cidade, String bairro, 
					String rua, String cep, String telefone) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.telefone = telefone;		
	}

	public String getRua() {
		return rua;
	}
}