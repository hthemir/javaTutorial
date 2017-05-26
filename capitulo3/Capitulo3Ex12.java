import java.util.Scanner;
public class Capitulo3Ex12 {
	public static void main (String[] parametros) {		
		Scanner s = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int matrizTransposta[][];
		int aux;
		System.out.println("Entre com 16 numeros");
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				matriz[i][j] = s.nextInt();
			}
		}
		System.out.println("Matriz:");
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		matrizTransposta = matriz;
		for (int i=0; i<4; i++) {
			for (int j=i; j<4; j++) {
				aux = matrizTransposta[i][j];
				matrizTransposta[i][j] = matrizTransposta[j][i];
				matrizTransposta[j][i] = aux;
			}
		}		
		System.out.println("Matriz transposta:");
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(matrizTransposta[i][j] + " ");
			}
			System.out.println();
		}
	}
}