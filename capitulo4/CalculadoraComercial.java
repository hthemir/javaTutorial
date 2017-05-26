public class CalculadoraComercial {
	private Calculadora calculadora;
	
	public CalculadoraComercial() {
		calculadora = new Calculadora();
	}
	public double soma(double x, double y) {
		return calculadora.soma(x,y);
	}
	public double subtracao(double x, double y) {
		return calculadora.subtracao(x,y);
	}
	public double multiplicacao(double x, double y) {
		return calculadora.multiplicacao(x,y);
	}
	public double divisao(double x, double y) {
		return calculadora.divisao(x,y);
	}
	public int porcentagem(double x, double y) {
		return (int) ((100*x)/y); //x eh % de y
	}
}