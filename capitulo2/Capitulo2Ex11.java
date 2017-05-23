import java.util.Scanner;
public class Capitulo2Ex11 {
	public static void main(String[] parametros) {
		Scanner s = new Scanner(System.in);
		System.out.print("salario: ");
		int salario = s.nextInt();
		System.out.print("dias trabalhados: ");
		int dias = s.nextInt();
		float salarioProporcional = (salario * dias) / 22;
		System.out.println("\nsalario proporcional: " + salarioProporcional);
	}
}