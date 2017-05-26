import java.util.ArrayList;
public class Capitulo3Ex16 {
	public static void main (String[] parametros) {
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> vetorOrdenado = new ArrayList<Integer>();
		vetor.add(5);
		vetor.add(4);
		vetor.add(3);
		vetor.add(2);
		vetor.add(1);
		vetor.add(0);
		vetor.add(9);
		vetor.add(8);
		vetor.add(7);
		vetor.add(6);
		int maior;
		for (int i=0; i<vetor.size(); i++) {
			maior = -2147483648;
			for (int j: vetor) {
				if(j > maior && !vetorOrdenado.contains(j))
					maior = j;
			}
			vetorOrdenado.add(0,maior);
		}
	}
}
