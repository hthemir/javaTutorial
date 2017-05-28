public class Aluno {
	private String nome;
	private String rg;
	private int idade;

	public Aluno(String nome, String rg, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}

	public String getRG() {
		return rg;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Aluno && ((Aluno)obj).getRG().equals(this.getRG())) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return (Integer.parseInt(rg));
	}

	public String toString() {
		return ("Nome: " + nome + ", rg: " + rg + ", idade: " + idade);
	}
}