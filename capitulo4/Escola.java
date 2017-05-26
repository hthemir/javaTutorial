import java.util.ArrayList;
public class Escola {
	private String nome;
	private String cnpj;
	private ArrayList<SalaDeAula> salas;
	
	public Escola(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		salas = new ArrayList<SalaDeAula>();
	}
	
	public boolean addSala(SalaDeAula sala) {
		if (salas.size() >= 20)
			return false;
		salas.add(sala);
		return true;
	}
	
	public void addAluno(Pessoa aluno, int numeroSala) {
		salas.get(numeroSala).addAluno(aluno);
	}
	
	public void transferencia(String cpf, int numeroSalaAtual, int numeroSala) {
		Pessoa alunoTransferido = new Pessoa("",0,"");
		for (Pessoa a: salas.get(numeroSalaAtual).getAlunos()) {
			if (a.getCpf().equals(cpf)) {
				alunoTransferido = a;
				salas.get(numeroSalaAtual).getAlunos().remove(a);
				break;
			}
		}
		salas.get(numeroSala).addAluno(alunoTransferido);
	}
	
	public void listarAlunos(int numeroSala) {
		for (Pessoa aluno: salas.get(numeroSala).getAlunos())
			System.out.println(aluno.getNome() + ", " + aluno.getCpf());
	}
}






