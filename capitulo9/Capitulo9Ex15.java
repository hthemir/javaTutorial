import java.util.HashSet;
public class Capitulo9Ex15 {
	public static void main(String[] parametros) {
		HashSet<ContaCorrente> lista = new HashSet<ContaCorrente>();
		lista.add(new ContaCorrente("4907-X",123,"joao","12213314456",200.0));
		lista.add(new ContaCorrente("7297-2",456,"jose","21123326678",100.0));
		lista.add(new ContaCorrente("5427-4",789,"ardonildo","39930038876",300.0));
		lista.add(new ContaCorrente("4827-8",123,"josefino","41144446609",299900.0));
		lista.add(new ContaCorrente("4907-X",456,"stalin","19910014376",2050.0));
		for (ContaCorrente conta:lista)
			System.out.println(conta.toString());
	}
} 