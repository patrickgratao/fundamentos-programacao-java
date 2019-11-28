package lista09;

public class Exercicio05 {
	
	public static void main(String[] args) {
		System.out.println("A área Rachurada éh ==> "+areaHachurada(2, 3, 5));
	}
	
	
	public static double areaHachurada (double raio, double bMenor, double bMaior) {
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		double areaTrapezio = ((bMaior + bMenor) * (2*raio)) / 2.0;
		
		return areaTrapezio - areaCirculo;
	}
	
	
	
}
