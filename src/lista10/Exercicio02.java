package lista10;

import java.util.ArrayList;
import java.util.Arrays;


public class Exercicio02 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(calcularX(0.1)));
	}
	
	public static double[] calcularX(double n) {
		double intervalo = n;
		double inicioIntervalo = (-1) * Math.PI;
		double fimIntervalo = Math.PI;
		
		ArrayList<Double> valorX = new ArrayList();
		
		for (int i = 0; inicioIntervalo <= fimIntervalo; i++) {
			valorX.add(Math.pow(0.9, i));
			inicioIntervalo +=intervalo;
		}
		
		double[] vetorX = new double [valorX.size()];
		
		for (int i = 0 ; i < vetorX.length; i++) {
			vetorX[i] = valorX.get(i);
		}
		
		return vetorX;
	}

}
