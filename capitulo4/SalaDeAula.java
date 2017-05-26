import java.util.ArrayList;
public class SalaDeAula {
	private ArrayList<Pessoa> alunos;

	public SalaDeAula() {
		alunos = new ArrayList<>();
	}

	public void addAluno(Pessoa aluno) {
		if (alunos.size() < 10) {
			alunos.add(aluno);
		} else {
			System.out.println("O numero maximo de alunos foi atingido");
		}
	}
	
	public ArrayList<Pessoa> getAlunos() {
		return alunos;
	}
}