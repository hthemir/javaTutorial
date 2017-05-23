import java.util.Scanner;
public class Capitulo2Ex4 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int dia = s.nextInt();
			switch (dia) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Terça");
					break;
				case 4:
					System.out.println("Quarta");
					break;
				case 5:
					System.out.println("Quinta");
					break;
				case 6:
					System.out.println("Sexta");
					break;
				case 7:
					System.out.println("Sábado");
					break;
				case 0:
					return;
				default:
					System.out.println("Entrada inválida");
					break;
			}
		}
	}
}
