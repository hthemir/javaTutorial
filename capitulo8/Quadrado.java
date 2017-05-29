public class Quadrado extends Quadrilatero implements FiguraGeometrica {
	public Quadrado(int lado) {
		super(lado, lado, lado, lado);
		if (lado <= 0)
			throw new IllegalArgumentException("Valor invalido, o valor esperado e maior que 0 (zero)");
	}

	public int calcularArea() {
		return (getLadoA()*getLadoA());
	}

	public int calcularPerimetro() {
		return (4*getLadoA());
	}
}
