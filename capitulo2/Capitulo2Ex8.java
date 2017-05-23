public class Capitulo2Ex8 {
	public static void main(String[] parametros) {
		int i = 0;
		int j = 0;
		while (i < 10) {
			j = 0; // correto tanto zerando quanto não zerando
			while (j < 10) {
				System.out.println(i + ", " + j);
				if (j == i) {
					i++;
					break;
				}
				j++;
			}
		}
	}
}