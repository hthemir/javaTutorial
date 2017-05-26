public class Contador {
	private int inicial;

	public int getInicial() {
		return inicial;
	}

	public void incrementar() {
		inicial++;
	}

	public void decrementar() {
		inicial--;
	}

	public void imprimir() {
		System.out.println(inicial);
	}
}