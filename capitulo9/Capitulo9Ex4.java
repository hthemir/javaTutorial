import java.util.Map;
import java.util.HashMap;
public class Capitulo9Ex4 {
	public static void main(String[] parametros) {
		Map lista = new HashMap();
		lista.put(1, "String 1");
		lista.put(1, "String 1");
		lista.put(2, "String 2");
		lista.put(2, "String 2");
		lista.put(3, "String 3");
		lista.put(3, "String 3");
		for (int i=1; i<lista.size()+1; i++)
			System.out.println(lista.get(i));
	}
} 

/* 3 elementos na colecao */