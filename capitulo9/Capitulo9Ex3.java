import java.util.HashSet;
public class Capitulo9Ex3 {
	public static void main(String[] parametros) {
		HashSet<String> lista = new HashSet<String>();
		lista.add("String 1");
		lista.add("String 1");
		lista.add("String 2");
		lista.add("String 2");
		lista.add("String 3");
		lista.add("String 3");
		for (String i:lista)
			System.out.println(i);
	}
} 

/* 3 elementos na colecao */