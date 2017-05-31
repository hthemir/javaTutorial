public class Retangulo extends Quadrilatero implements FiguraGeometrica {
	public Retangulo(int ladoA, int ladoB) {
		super(ladoA, ladoB, ladoA, ladoB);
		if (ladoA <= 0 || ladoB <= 0)
			throw new IllegalArgumentException("Valor invalido, os valores esperados sao maior que 0 (zero)");
		if (ladoA == ladoB)
			throw new IllegalArgumentException("Valor invalido, modifique um dos valores a fim de torna-los diferentes");
	}


	public int calcularArea() {
		return (getLadoA()*getLadoB());
	}

	public int calcularPerimetro() {
		return (2*getLadoA() + 2*getLadoB());
	}
}
