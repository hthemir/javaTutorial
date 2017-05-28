import java.util.ArrayList;
import java.util.Collections;
public class Capitulo9Ex12 {
	public static void main(String[] parametros) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");
		Collections.sort(lista);
		for (String i:lista)
			System.out.println(i);
	}
} 
