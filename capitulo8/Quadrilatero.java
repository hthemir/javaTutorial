public abstract class Quadrilatero implements FiguraGeometrica {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	private int ladoD;

	public Quadrilatero(int ladoA, int ladoB, int ladoC, int ladoD) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
	}

	public String toString() {
		return (ladoA+" "+ladoB+" "+ladoC+" "+ladoD);
	}

	public int getLadoA() {
		return ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public int getLadoD() {
		return ladoD;
	}
}