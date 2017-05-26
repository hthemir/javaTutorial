public class EscolaTeste {
	public static void main(String[] parametros) {
		Escola escola = new Escola("escola do mateus alado", "123");
		escola.addSala(new SalaDeAula());
		escola.addSala(new SalaDeAula());
		escola.addSala(new SalaDeAula());
		
		escola.addAluno(new Pessoa("joao", 20, "11122233344"),0);
		escola.addAluno(new Pessoa("jose", 20, "11122233345"),0);
		escola.addAluno(new Pessoa("josimar", 20, "11122233346"),1);
		escola.addAluno(new Pessoa("josley", 20, "11122233347"),1);
		escola.addAluno(new Pessoa("jilmar", 20, "11122233348"),1);
		escola.addAluno(new Pessoa("jardineiro", 20, "11122233349"),2);
		escola.addAluno(new Pessoa("jil", 20, "11122233340"),2);
		
		System.out.println("Sala 1:");
		escola.listarAlunos(0);
		System.out.println("Sala 2:");
		escola.listarAlunos(1);
		System.out.println("Sala 3:");
		escola.listarAlunos(2);
		
		escola.transferencia("11122233346", 1, 0);
		System.out.println("\nSala 1:");
		escola.listarAlunos(0);
		System.out.println("Sala 2:");
		escola.listarAlunos(1);
		System.out.println("Sala 3:");
		escola.listarAlunos(2);
	}
}