/*
 *	4. Escreva um programa para ler 9 n�meros inteiros para preencher uma matriz 3x3,
ou seja, com 3 linhas e 3 colunas (considere que n�o ser�o informados valores
duplicados). 

A seguir, leia um n�mero inteiro e mostre uma mensagem indicando se o
valor lido existe ou n�o na matriz. 
 
 * */

package lista08;

import javax.swing.JOptionPane;

public class exercicio04 {
	public static void main(String[] args) {
		int tamanho = 3;
		int[][] matriz = new int[tamanho][tamanho];
		int numeroBuscado;
		String resposta = "Valor inexistente";

		// Grava��o dos Dados
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				matriz[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog("\nDigite o valor da posi��o [ " + (i + 1) + ", " + (j + 1) + "]"));
			}
		}

		// Inser��o do n�mero a ser buscado
		numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja buscar"));

		// Busca do N�mero

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
