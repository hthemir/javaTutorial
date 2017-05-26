public class CarroCorrida {
	private Integer numeroIdentificacao;
	private Double velocidadeAtual = 0.0;
	private Double velocidadeMaxima = 100.0;
	private Motor motor;

	public CarroCorrida(Integer numeroIdentificacao, Double velocidadeMaxima) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public CarroCorrida(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	void ligar() {
		System.out.println("VRUM");
	}

	void desligar() {
		System.out.println("MMmm..");
	}

	void acelerar() {
		velocidadeAtual += motor.getPotencia()*0.1;
		if (velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
	}

	void frear(Integer intensidadeFreada) {
		if(intensidadeFreada > 100) {
			intensidadeFreada = 100;
		}else if(intensidadeFreada < 0) {
			intensidadeFreada = 0;
		}
		velocidadeAtual -= intensidadeFreada*0.25;
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0.0;
		}
	}

	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public void setVelocidadeAtual(Double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}