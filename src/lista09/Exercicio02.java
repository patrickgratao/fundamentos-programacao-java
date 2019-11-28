package lista09;

public class Exercicio02 {
	public static double calcularY (double x) {
		double h = Math.pow(x, 2)- 16;
		double f, g = -1, y;
		if (h >= 0) {
			f = 1;
		}
		else {
			f = 0;
		}
		
		if (f == 1) {
			g = Math.pow(x, 2) - 16;
			
		}
		else if (f == 0) {
			g = Math.pow(x, 3);
		}
		
		y = g + 10*f;
		
		return y;
		
	}
	
	public static void main(String[] args) {
		System.out.println(calcularY(3));
	}
}
