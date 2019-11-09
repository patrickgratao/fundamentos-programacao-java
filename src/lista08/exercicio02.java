/*
 * Desenvolva um programa que leia duas matrizes (2 x 3 e 3 x 2) do tipo inteiro.
Efetue a multiplicação da matriz e apresente a matriz resultante. 
 * 
 * */

package lista08;

import javax.swing.JOptionPane;

public class exercicio02 {
	public static void main(String[] args) {
		double matrizA[][] = new double[2][3];
		double matrizB[][] = new double[3][2];
		double resultante[][] = new double[2][2];

		// Leitura da Matriz A
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				matrizA[i][j] = Double.parseDouble(JOptionPane
						.showInputDialog("Matriz A\nDigite o valor da posição [ " + (i + 1) + ", " + (j + 1) + "]"));
			}
		}

		// Leitura da Matriz B
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matrizB[i][j] = Double.parseDouble(JOptionPane
						.showInputDialog("Matriz B\nDigite o valor da posição [ " + (i + 1) + ", " + (j + 1) + "]"));
			}
		}

		// Lógica do Programa
		//for (int i = 0; i < 3 )
	
		// Impressões
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("  %2f",resultante[i][j]);
			}
			System.out.println("\n");
		}

	}
}
