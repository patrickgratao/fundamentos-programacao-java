/**
 * AUTHOR: Fernando Furtado
 **/

package lista10;

public class Exercicio03 {
	public static void main(String[] args) {
		double[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		calcularY(x);
	}

	public static double[] calcularY(double[] x) {
		int k = 1;
		double cont;
		double[] y = new double[x.length];
		int a, n;
		a = n = 0;
		while (a < x.length) {
			cont = 0;
			n = 0;
			while (n < x.length) {
				cont += x[n] / (Math.abs((k - n)));
				k++;
				if (k > 10)
					k = 1;
    				n++;
			}
			System.out.print(cont + " | ");
			a++;
		}
		return y;
	}
}
