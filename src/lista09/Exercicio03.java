package lista09;

import java.util.Arrays;

public class Exercicio03 {
	public static double[] delta(double a, double b, double c) {
		double[] raizes = new double[2];
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta > 0) {
			for (int i = 0; i < raizes.length; i++) {
				if (i % 2 == 0) {
					raizes[i] = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
				} else {
					raizes[i] = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
				}
			}
		}

		else if (delta == 0) {
			for (int i = 0; i < raizes.length; i++) {
				raizes[i] = (-1 * b) / (2 * a);
			}
		}

		else {
			return raizes;
		}

		return raizes;
	}

	public static void main(String[] args) {
		for (double valor : delta(2, 3, 4)) {
			System.out.println(valor);

		}
	}
}