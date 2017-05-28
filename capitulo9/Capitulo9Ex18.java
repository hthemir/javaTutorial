import java.util.HashSet;
public class Capitulo9Ex18 {
	public static void main(String[] parametros) {
		HashSet<Aluno> lista = new HashSet<Aluno>();
		lista.add(new Aluno("joao","347651351",20));
		lista.add(new Aluno("jose","896767432",20));
		lista.add(new Aluno("ardonildo","684642433",20));
		lista.add(new Aluno("josefino","347651351",20));
		lista.add(new Aluno("stalin","347651351",20));
		for (Aluno aluno:lista)
			System.out.println(aluno.toString());
	}
}

/* Com hashCode() padrao: existem alunos nesta turma com o mesmo RG 
   Com hashCode() sobreescrito: nao existem alunos nesta turma com o mesmo RG */