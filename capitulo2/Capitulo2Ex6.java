public class Capitulo2Ex6 {
	public static void main(String[] parametros) {
		int i = 0;
		int x = 10;

		while (i<20) {
			System.out.println(x);
			i++;
		}

		i = 0;
		do {
			System.out.println(x);
			i++;
		} while (i<20);
	}
}