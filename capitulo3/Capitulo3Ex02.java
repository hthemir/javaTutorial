public class Capitulo3Ex02 {
	public static void main(String[] parametros) {
		int x[] = {2,2,2,2,2,2,2,2,2,2};
		float soma = 0f;
		for (int i=0; i<10; i++) {
			soma += x[i];
		}
			System.out.print("media: " + soma/10);
	}
}