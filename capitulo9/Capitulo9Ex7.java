import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Capitulo9Ex7 {
	public static void main(String[] parametros) {
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(20);
		hashSet.add(200);
		hashSet.add(30);
		hashSet.add(80);
		hashSet.add(40);
		hashSet.add(100);
		hashSet.add(200);
		Iterator<Integer> iteratorHashSet = hashSet.iterator();
		int media = 0;
		while (iteratorHashSet.hasNext()) {
			media += iteratorHashSet.next();
		}
		media /= hashSet.size();
		System.out.println(media);
	}
} 