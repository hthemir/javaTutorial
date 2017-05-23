public class Capitulo2Ex7 {
	public static void main(String[] parametros) {
		int soma = 0;
		long multiplicacao = 1;

		for (int i = 2; i < 30; i++) {
			if (i % 2 == 1){
				soma += i;
			} else {
				multiplicacao *= i;
			}
		}
			System.out.println(soma);
			System.out.println(multiplicacao);
	}
}