import java.util.ArrayList;
public class AnimalTeste {
	public static void main(String[] parametros) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		animais.add(new Cachorro("cachorro",3,"woof woof"));
		animais.add(new Cavalo("cavalo",100,"ihoh"));
		animais.add(new Preguica("preguica",15,"..."));
		Veterinario vet = new Veterinario();

		for(Animal a: animais)
			vet.examinar(a);
	}
}