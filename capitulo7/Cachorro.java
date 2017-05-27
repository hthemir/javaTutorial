public class Cachorro extends Animal {

	public Cachorro (String nome, int idade, String som) {
		setNome(nome);
		setIdade(idade);
		setSom(som);
	}

	public void correr() {
		System.out.println("correndo");
	}
}