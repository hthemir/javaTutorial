public class CalculadoraTeste {
	public static void main(String[] parametros) {
		double x = Double.parseDouble(parametros[0]);
		double y = Double.parseDouble(parametros[1]);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("soma: " + calculadora.soma(x,y));
		System.out.println("subtracao: " + calculadora.subtracao(x,y));
		System.out.println("multiplicacao: " + calculadora.multiplicacao(x,y));
		System.out.println("divisao: " + calculadora.divisao(x,y));
	}
}