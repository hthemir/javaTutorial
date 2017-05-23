public class Capitulo2Ex20 {
	public static void main(String[] parametros) {
		int i;
		int j;
		for (i=0; i<8; i++) {
			for (j=0; j<=i; j++) {
				System.out.print(j<=i ? "*" : " ");
			}
			System.out.println();
		}

		System.out.println();
		for (i=8; i>0; i--) {
			for (j=0; j<i; j++) {
				System.out.print(j<i ? "*" : " ");
			}
			System.out.println();
		}

		System.out.println();
		for (i=0; i<8; i++) {
			for (j=0; j<8; j++) {
				System.out.print(j<i ? " " : "*");
			}
			System.out.println();
		}

		System.out.println();
		for (i=8; i>0; i--) {
			for (j=0; j<8; j++) {
				System.out.print(j>=i-1 ? "*" : " ");
			}
			System.out.println();
		}
	}
}