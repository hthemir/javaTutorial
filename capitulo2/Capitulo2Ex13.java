import java.util.Scanner;
public class Capitulo2Ex13 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		int opcao;
		int entrada;
		int saida;
		int i,j;
		while (true) {
			System.out.println("1 – calcular o fatorial de um número dado");
			System.out.println("2 – calcular a raiz quadrada de 3 números dados");
			System.out.println("3 – imprimir a tabuada completa de 1 a 10");
			System.out.println("4 – sair do programa");
			opcao = s.nextInt();
			switch (opcao) {
				case 1:
					System.out.print("fatorial: ");
					entrada = s.nextInt();
					saida = 1;
					for (i=1; i<= entrada; i++) {
						saida *= i;
					}
					System.out.println(saida);
					break;
				case 2:
					entrada = s.nextInt();
					System.out.println(Math.sqrt(entrada));
					entrada = s.nextInt();
					System.out.println(Math.sqrt(entrada));
					entrada = s.nextInt();
					System.out.println(Math.sqrt(entrada));
					break;
				case 3:
					for (i=1; i<11; i++) {
						for (j=1; j<11; j++) {
							System.out.print(i*j + " ");
						}
						System.out.print("\n");
					}
					break;
				case 4:
					return;
				default:
				System.out.println("entrada invalida");
					break;
			}
		}
	}
}