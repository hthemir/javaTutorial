public class Capitulo3Ex13 {
	public static void main (String[] parametros) {		
		String aux;
		for (int i=0; i<5; i++) {
			aux = parametros[i];
			parametros[i] = parametros[9-i];
			parametros[9-i] = aux;
		}
		for (int i=0; i<10; i++) {
			System.out.print(parametros[i] + " ");
		}
		
	}
}
