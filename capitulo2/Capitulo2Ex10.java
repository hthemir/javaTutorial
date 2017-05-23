import java.util.Scanner;
public class Capitulo2Ex10 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um número inteiro:");
		int numero = s.nextInt();
		if (ehPrimo(numero)) {
			System.out.println(numero + " é primo");
		} else {

			System.out.println(numero + " não é primo");
		}
	}

	public static boolean ehPrimo(int numero) {
		if (numero == 1 || numero % 2 == 0)
			return false;
		if (numero == 2)
			return true;


		for (int i = 3; i < numero/2; i=i+2) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}
}