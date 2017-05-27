public class Cavalo extends Animal {

	public Cavalo (String nome, int idade, String som) {
		setNome(nome);
		setIdade(idade);
		setSom(som);
	}

	public void correr() {
		System.out.println("correndo");
	}
}