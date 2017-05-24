import java.util.Scanner;
import java.util.Arrays;
public class Capitulo3Ex07 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		Double vetor[] = new Double[10];
		for (int i=0; i<10; i++) {
			vetor[i] = s.nextDouble();
		}
		Arrays.sort(vetor);
		for (int i=0; i<10; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}