import java.util.Scanner;
public class Capitulo2Ex12 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		int numero;
		int soma;
		while (true) {
			numero = s.nextInt();
			soma = 0;
			if (numero == 0) {
				return;
			} else {
				for (int i=1; i<= numero/2; i++) {
					if (numero % i == 0) {
						soma += i;
					}
				}
				if (soma == numero) {
					System.out.println(numero + " é perfeito");
				} else {
					System.out.println(numero + " não é perfeito");
				}
			}
		}
	}
}