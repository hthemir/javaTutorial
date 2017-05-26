public class Capitulo5Ex1 {
	public void validaString(String parametro) {
		if (parametro.length() < 8 || parametro.charAt(0)!='A') {
			System.out.println("string invalida");
		}
	}
	
	public void mostraCaracteres(String parametro) {
		System.out.println(parametro.substring(0,4).toUpperCase());
		if (parametro.matches(".*\\d.*"))
			System.out.println("A string contem numeros");
	}
}