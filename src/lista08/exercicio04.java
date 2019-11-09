/*
 *	4. Escreva um programa para ler 9 números inteiros para preencher uma matriz 3x3,
ou seja, com 3 linhas e 3 colunas (considere que não serão informados valores
duplicados). 

A seguir, leia um número inteiro e mostre uma mensagem indicando se o
valor lido existe ou não na matriz. 
 
 * */

package lista08;

import javax.swing.JOptionPane;

public class exercicio04 {
	public static void main(String[] args) {
		int tamanho = 3;
		int[][] matriz = new int[tamanho][tamanho];
		int numeroBuscado;
		String resposta = "Valor inexistente";

		// Gravação dos Dados
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				matriz[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog("\nDigite o valor da posição [ " + (i + 1) + ", " + (j + 1) + "]"));
			}
		}

		// Inserção do número a ser buscado
		numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja buscar"));

		// Busca do Número

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if (matriz[i][j] == numeroBuscado) {
					resposta = "Valor existe na matriz!";
				}

			}
		}

		System.out.println(resposta);

	}
}
