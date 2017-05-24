public class Capitulo3Ex03 {
	public static void main(String[] parametros) {
		int x[] = {2,2,2,2,2,2,2,2,2,2};
		int multiplicacao = 1;
		for (int i=0; i<10; i++) {
			multiplicacao *= x[i];
		}
			System.out.print("multiplicacao: " + multiplicacao);
	}
}