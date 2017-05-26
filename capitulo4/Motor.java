public class Motor {
	private int potencia;

	public Motor (int potencia) {
		this.potencia = potencia;
		if (potencia > 100)
			this.potencia = 100;
		if (potencia < 0)
			this.potencia = 0;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}