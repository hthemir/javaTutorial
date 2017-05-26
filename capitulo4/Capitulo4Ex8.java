public class Capitulo4Ex8 {
	public static void main(String[] parametros) {
		Pessoa joao = new Pessoa("Joao", 20, "11211311456");
		Pessoa jose = new Pessoa("Jose", 20, "21221321467");

		System.out.println(joao.getNome() + ", " + joao.getIdade() + ", " + joao.getCpf());
		System.out.println(jose.getNome() + ", " + jose.getIdade() + ", " + jose.getCpf());		
	}
}