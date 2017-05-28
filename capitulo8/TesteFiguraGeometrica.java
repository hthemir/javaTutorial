import java.util.Scanner;
import javax.swing.JOptionPane;
public class TesteFiguraGeometrica {
	public static void main(String[] parametros) {
		try {
			System.out.println("Entre com 2 parametros");
			Scanner s = new Scanner(System.in);
			int ladoA = s.nextInt();
			int ladoB = s.nextInt();
			Quadrado quadrado = new Quadrado(ladoA);
			System.out.println("perimetro: " + quadrado.calcularPerimetro());
			System.out.println("area: " + quadrado.calcularArea());
		} catch (Throwable t) {
			t.printStackTrace();
			JOptionPane.showMessageDialog(null, t.getMessage());
		}
	}
}