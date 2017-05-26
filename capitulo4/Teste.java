public class Teste {
	public static void main(String[] parametros) {
		Cadastro cadastro = new Cadastro();
		Pessoa joao = new Pessoa("Joao", 20, "11211311456");
		Endereco endJoao = new Endereco("","","","alameda dos anjos","","");
		Pessoa jose = new Pessoa("Jose", 20, "21221321467");
		Endereco endJose = new Endereco("","","","gotham city","","");
		cadastro.addPessoa(joao, endJoao);
		cadastro.addPessoa(jose, endJose);
		cadastro.printPessoal();
		cadastro.removePessoa("11211311456");
		cadastro.printPessoal();
	}
}