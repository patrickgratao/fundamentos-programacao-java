package lista07;

import javax.swing.JOptionPane;

public class exercicio09 {
	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que leia quinze n�meros do usu�rio e armazene em um
		 * vetor a raiz quadrada de cada n�mero. Caso o valor digitado seja menor que
		 * zero o n�mero �1 deve ser atribu�do ao elemento do vetor. Ap�s isso, o
		 * programa deve imprimir todos os valores armazenados. Use o m�todo
		 * Math.sqrt(x) para calcular a raiz quadrada de um n�mero.
		 */

		int tamanho = 15;
		double[] vetor = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {
			Double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
			if (numero < 0.0) {
				vetor[i] = -1.0;
			}

			else {
				vetor[i] = Math.sqrt(numero);
			}
		}

		for (double raizes : vetor) {
			System.out.print(raizes + ", ");
		}
	}
}
