package lista08;

import javax.swing.JOptionPane;

/*
 * 2. Desenvolva um programa que leia duas matrizes (2 x 3 e 3 x 2) do tipo inteiro.
 Efetue a multiplicação da matriz e apresente a matriz resultante. 
 * 
 * */
public class exercicio02 {
	public static void main(String[] args) {
		int[][] matrizA = new int[2][3];
		int[][] matrizB = new int[3][2];

		// Variáveis auxiliares
		int n = matrizA[0].length; // numero de colunas da primeira matriz
		int linhas = matrizA.length; // numero de linhas da resultante
		int colunas = matrizB[0].length; // numero de colunas da resultante

		//Matriz Resultante do Produto de A e B
		int[][] matrizC = new int[linhas][colunas];


		// Preenchimento Matriz A
		System.out.println("Matriz A");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor [" + i + "," + j + "]"));
			}
		}

		// Preenchimento Matriz B
		System.out.println("Matriz B");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor [" + i + "," + j + "]"));
			}
		}
		// Lógica do Programa
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				for (int k = 0; k < n; k++) {
					matrizC[i][j] = matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
				}

			}
		}

		for (int i = 0; i < linhas; i++) {
			System.out.print("[ ");
			for (int j = 0; j < colunas; j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println("]");
		}

	}

}
