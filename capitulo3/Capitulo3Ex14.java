import java.util.Scanner;
public class Capitulo3Ex14 {
	public static void main (String[] parametros) {
	Double entrada[] = new Double[10];
	Double constante;
	Scanner s = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			entrada[i] = s.nextDouble();
		}
		constante = entrada[1] - entrada[0];
		for (int i=2; i<10; i++) {
			if (entrada[i] - entrada[i-1] != constante) {
				System.out.println("nao e progressao aritmetica");
				return;
			}
		}
		System.out.println("e progressao aritmetica");		
	}
}
