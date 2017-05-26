public class Capitulo5Ex5 {
	double x1;
	double x2;
	double maior;	

	public Capitulo5Ex5() {
		x1 = Math.random() * 1000;
		x2 = Math.random() * 1000;
		maior = (x1>x2 ? x1 : x2);
	}
}