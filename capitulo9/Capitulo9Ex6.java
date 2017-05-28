import java.util.ArrayList;
import java.util.Iterator;
public class Capitulo9Ex6 {
	public static void main(String[] parametros) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(100);
		lista.add(20);
		lista.add(200);
		lista.add(30);
		lista.add(80);
		lista.add(40);
		lista.add(100);
		lista.add(200);
		Iterator<Integer> iteratorLista = lista.iterator();
		int media = 0;
		while (iteratorLista.hasNext()) {
			media += iteratorLista.next();
		}
		media /= lista.size();
		System.out.println(media);
	}
} 