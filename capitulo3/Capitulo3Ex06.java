public class Capitulo3Ex06 {
	public static void main(String[] parametros) {
		double x[] = {1,1,1};
		double y[] = {1,1,2};
		double soma = 0;
		for (int i=0; i<x.length; i++) {
			soma += x[i]*y[i];
		}
		System.out.print(soma);
	}
}