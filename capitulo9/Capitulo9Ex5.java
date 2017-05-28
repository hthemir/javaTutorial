import java.util.ArrayList;
public class Capitulo9Ex5 {
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
		int media = 0;
		for (int i:lista)
			media += i;
		media /= lista.size();
	}
} 
