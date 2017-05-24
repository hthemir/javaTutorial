import java.util.Scanner;
public class Capitulo3Ex10 {
	public static void main(String[] parametros) {
		int entrada1[] = new int[10];
		int entrada2[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com 10 numeros inteiros");
		for (int i=0; i<entrada1.length; i++) {
			entrada1[i] = s.nextInt();
		}
		System.out.println("Entre com 5 numeros inteiros");
		for (int i=0; i<entrada2.length; i++) {
			entrada2[i] = s.nextInt();
		}
		for (int i=0; i<entrada2.length; i++) {
			for (int j=0; j<entrada1.length; j++) {
				if (entrada2[i] == entrada1[j])
					break;
				if (j == entrada1.length - 1) {
					System.out.println("O segundo vetor nao esta contido no primeiro");
					return;
				}
			}
		}
		System.out.println("O segundo vetor esta contido no primeiro");
	}
}