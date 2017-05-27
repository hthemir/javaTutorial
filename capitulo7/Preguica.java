public class Preguica extends Animal {

	public Preguica (String nome, int idade, String som) {
		setNome(nome);
		setIdade(idade);
		setSom(som);
	}

	public void subirArvore() {
		System.out.println("subindo");
	}
}