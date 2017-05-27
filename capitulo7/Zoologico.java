public class Zoologico {
	public static void main(String[] parametros) {
		Animal[] jaulas = {new Cachorro("cachorro",3,"woof woof"), 
							new Preguica("preguica",15,"..."),
							new Cavalo("cavalo",100,"ihoh")};
		for (int i=0; i<jaulas.length; i++) {
			jaulas[i].emitirSom();
			if (jaulas[i].getNome().equals("cachorro")) {
				((Cachorro)jaulas[i]).correr();
			} else if (jaulas[i].getNome().equals("cavalo")) {
				((Cavalo)jaulas[i]).correr();
			}
		}
	}
}