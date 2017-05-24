import javax.swing.JOptionPane;
public class Capitulo3Ex08 {
	public static void main(String[] parametros) {
		String resposta = new String();
		for (int i=0; i<parametros.length; i++) {
			resposta += parametros[i] + " ";
		}
		JOptionPane.showMessageDialog(null, resposta);
	}
}