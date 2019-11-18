package provaSubstitutiva;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * 2. Desenvolva um programa que leia duas matrizes (2 x 3 e 3 x 2) do tipo
 * inteiro. Efetue a multiplicação da matriz e apresente a matriz resultante.
 * 
 */

public class ExercicioMatriz {
	
	public static int[][] lerMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o valor [" + i + ", " + j + "]"));
			}
		}
		return matriz;
	}
	
	public static void imprimirMatriz(int [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		int[][] matrizA = new int[2][3];
		int[][] matrizB = new int[3][2];
		
		//Variaveis Auxiliares;
		int n = matrizA[0].length;
		int linhas = matrizA.length;
		int colunas = matrizB[0].length;
		
		//Matriz Resultante		
		int[][] matrizC = new int[linhas][colunas];

		// Preenchimento de Matrizes
		matrizA = lerMatriz(matrizA);
		matrizB = lerMatriz(matrizB);
		
		// Lógica do Problema
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				for (int k = 0; k < n; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		//Impressão Matriz Resultante
		imprimirMatriz(matrizC);
	}
}
