import java.util.Scanner;
public class Capitulo3Ex15 {
	public static void main (String[] parametros) {
	Double entrada[] = new Double[10];
	Double maior = 0.0;
	Double menor = 0.0;
	Scanner s = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			entrada[i] = s.nextDouble();
			if (i==0) {
				maior = entrada[i];
				menor = entrada[i];
			} else {
				if (entrada[i] > maior)
					maior = entrada[i];
				if (entrada[i] < menor)
					menor = entrada[i];
			}
		}
		System.out.println("maior valor: " + maior);
		System.out.println("menor valor: " + menor);
		System.out.println("diferenca: " + (maior - menor));		
	}
}
