import java.util.ArrayList;
public class Cadastro {
	private ArrayList<Pessoa> pessoal;

	public Cadastro() {
		pessoal = new ArrayList<>();
	}

	public boolean addPessoa(Pessoa pessoa, Endereco endereco) {
		if (pessoal.size() < 100) {
			pessoa.setEndereco(endereco);
			pessoal.add(pessoa);
		}
		return false;
	}

	public boolean removePessoa(String cpf) {
		for (Pessoa p: pessoal) {
			if (p.getCpf().equals(cpf)) {
				pessoal.remove(p);
				return true;
			}
		}
		return false;
	}

	public void printPessoal() {
		for (Pessoa p: pessoal) {
			System.out.println(p.getNome() + ", " + p.getIdade() + ", " + p.getCpf() + ", " +
				p.getEndereco().getRua());
		}
	}
}