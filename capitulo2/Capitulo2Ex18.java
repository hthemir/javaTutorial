public class Capitulo2Ex18 {
	public static void main(String[] parametros) {
		float investimento = 100f;
		float rendimento = 0.05f;
		int meses = 0;
		while (true) {
			investimento += (investimento * rendimento);
			meses++;
			if (investimento >= 200f)
				break;
		}
		System.out.println(meses + " meses");
	}
}