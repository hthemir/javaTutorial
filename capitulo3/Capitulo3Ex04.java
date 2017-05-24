public class Capitulo3Ex04 {
	public static void main(String[] parametros) {
		int x[] = {0,1,2,3,4,5,6,7,8,9};
		int aux;
		for (int i=0; i<5; i++) {
			aux = x[i];
			x[i] = x[9-i];
			x[9-i] = aux;
			System.out.print(x[i] + " ");
		}
	}
}