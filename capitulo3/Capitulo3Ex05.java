public class Capitulo3Ex05 {
	public static void main(String[] parametros) {
		boolean x[] = {true, true};
		boolean y[] = {true, true};

		if (y.length != x.length) {
			System.out.print("Nao sao identicos");
		} else {
			for (int i=0; i<x.length; i++) {
				if (x[i] != y[i]) {
					System.out.print("Nao sao identicos");
					return;
				}
			}
			System.out.print("Sao identicos");
		}		
	}
}