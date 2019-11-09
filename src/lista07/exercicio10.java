package lista07;

import javax.swing.JOptionPane;

/*	Crie um programa em Java que que receba a altura de 10 atletas. Esse programa
* 	deve imprimir a altura daqueles atletas que tem altura maior que a média
 * */

public class exercicio10 {
	public static void main(String[] args) {
		int tamanho = 10;
		double[] alturas = new double[tamanho];
		double media = 0;

		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura " + (1 + i)));
			media += alturas[i];
		}

		media = media / alturas.length;

		System.out.println("Atletas com Altura maior que a média => " + media);
		for (double altura : alturas) {
			if (altura > media) {
				System.out.println(altura);
			}
		}
	}
}
