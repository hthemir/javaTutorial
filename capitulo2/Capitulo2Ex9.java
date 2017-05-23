import java.util.Scanner;
public class Capitulo2Ex9 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um número inteiro de no maximo 4 digitos:");
		int numero = s.nextInt();
		int ultimoDigito = 0;
		int reverso = 0;
		if (numero > 9999) {
			System.out.println("Entrada inválida");
		} else {
			while (numero != 0) {
				ultimoDigito = numero % 10;
				reverso = reverso * 10 + ultimoDigito;
				numero = numero / 10;
			}
			System.out.println(reverso);
		}
	}
}