import java.util.ArrayList;
public class FuncionarioTeste {
	public static void main(String[] parametros) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new FuncionarioEnsinoBasico("Edgar", "111", new Vendedor(), "escola do garfield"));
		funcionarios.add(new FuncionarioEnsinoBasico("Wally", "122", new Vendedor(), "escola do garfield"));
		funcionarios.add(new FuncionarioEnsinoBasico("Engel", "133", new Vendedor(), "escola do garfield"));
		funcionarios.add(new FuncionarioEnsinoBasico("Clover", "144", new Vendedor(), "escola do garfield"));
		funcionarios.add(new FuncionarioEnsinoMedio("Airam", "211", new Vendedor(), "escola do garfield", "socrates"));
		funcionarios.add(new FuncionarioEnsinoMedio("Adat", "222", new Vendedor(), "escola do garfield", "socrates"));
		funcionarios.add(new FuncionarioEnsinoMedio("Yeray", "233", new Vendedor(), "escola do garfield", "socrates"));
		funcionarios.add(new FuncionarioEnsinoMedio("Beneharo", "244", new Supervisor(), "escola do garfield", "socrates"));
		funcionarios.add(new FuncionarioGraduado("Agim", "311", new Supervisor(), "escola do garfield", "socrates", "ufbg"));
		funcionarios.add(new FuncionarioGraduado("Dardan", "322", new Gerente(), "escola do garfield", "socrates", "ufbg"));
		gastoComSalarioPorNivel(funcionarios);
		gastoComSalariosTotal(funcionarios);
		verFuncionarios(funcionarios);
	}

	public static void gastoComSalariosTotal(ArrayList<Funcionario> lista) {
		double total = 0.0;
		for (Funcionario f:lista) {
			total += f.rendaComComissao();
		}
		System.out.println("Gasto total com salario: " + total);
	}

	public static void gastoComSalarioPorNivel(ArrayList<Funcionario> lista) {
		double total = 0;
		for (Funcionario f:lista) {
			if (f.getClass()==FuncionarioEnsinoBasico.class)
				total += f.rendaComComissao();
		}
		System.out.println("Gasto total com funcionarios de ensino basico: " + total);
		total = 0;
		for (Funcionario f:lista) {
			if (f.getClass()==FuncionarioEnsinoMedio.class) 
				total += f.rendaComComissao();
		}
		System.out.println("Gasto total com funcionarios de ensino medio: " + total);
		total = 0;
		for (Funcionario f:lista) {
			if (f.getClass()==FuncionarioGraduado.class)
				total += f.rendaComComissao();
		}
		System.out.println("Gasto total com funcionarios graduados: " + total);
	}

	public static void verFuncionarios(ArrayList<Funcionario> lista) {
		for (Funcionario f:lista)
			System.out.println(f);
	}
}