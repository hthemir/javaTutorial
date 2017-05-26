import java.util.Scanner;
public class Capitulo3Ex11 {
	public static void main (String[] parametros) {		
		Scanner s = new Scanner(System.in);
		int vetor[] = new int[10];
		int aux;
		int contador;
		System.out.println("Entre com 10 numeros inteiros");
		for (int i=0; i<10; i++) {
			vetor[i] = s.nextInt();
		}
		for (int i=0; i<10; i++) {
			aux = vetor[i];
			contador = 0;
			for (int j=0; j<10; j++) {
				if (vetor[i] == vetor[j])
					contador++;
			}
			System.out.println("O numero " + vetor[i] + " ocorre " + contador + " vezes");
		}
	}
}