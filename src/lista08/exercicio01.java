/*
 * 1. Codifique um programa que leia uma matriz quadrada de ordem 3 e exiba apenas
	os elementos da diagonal principal. 
 * 
 * */

package lista08;

import javax.swing.JOptionPane;

public class exercicio01 {
	public static void main(String[] args) {
		int linhas = 3, colunas = 3;
		double matriz[][] = new double[linhas][colunas];

		// Preenchimento da Matriz
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				matriz[linha][coluna] = Double.parseDouble(
						JOptionPane.showInputDialog("Digite o valor da posição [ " + (linha+1) + ", " + (coluna+1) + "]"));
			}
		}

		// Leitura da Matriz
		System.out.println("Diagonal Principal");
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				if (linha == coluna) {
					System.out.print(matriz[linha][coluna]+", ");
				}
					
			}
		}
	}
}
