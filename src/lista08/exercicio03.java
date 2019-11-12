package exercicios;

import javax.swing.JOptionPane;

/*
 * 3. Desenvolva um programa que leia duas matrizes do tipo inteiro m1 e m2 de ordem
3. Após a inserção dos elementos das matrizes o programa deve oferecer ao usuário
as seguintes opções:
1. Mostrar as duas matrizes
2. Multiplicar as duas matrizes e mostrar a matriz resultante
3. Somar as duas matrizes e mostrar a matriz resultante 

 * 
 * */
public class exercicio03 {
	public static void main(String[] args) {
		int[][] matriz1 = new int[2][3];
		int[][] matriz2 = new int[3][2];

		int n = matriz1[0].length;
		int linhas = matriz1.length;
		int colunas = matriz2[0].length;
		int opcao;

		// Leitura da Matriz 1
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[0].length; j++) {
				matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz 1 \nValor [" + i + "," + j + "]"));
			}
		}

		// Leitura da Matriz 2
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz 2 \nValor [" + i + "," + j + "]"));
			}
		}

		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe a Opção desejada: \n 1. Mostrar as duas matrizes\n2. Multiplicar as duas matrizes e mostrar a matriz resultante\n3. Somar as duas matrizes e mostrar a matriz resultante"));
		
		if (opcao == 1) {
			System.out.println("Matriz 1");
			for (int i = 0; i < matriz1.length;i++) {
				System.out.print("[ ");
				for (int j = 0; j < matriz1.length; j++) {
					System.out.print(matriz1[i][j] + " ");
				}
				System.out.println("]");
			}
			
			System.out.println("Matriz 2");
			for (int i = 0; i < matriz2.length;i++) {
				System.out.print("[ ");
				for (int j = 0; j < matriz2.length; j++) {
					System.out.print(matriz2[i][j] + " ");
				}
				System.out.println("]");
			}
		}
		
		if (opcao == 2) {
			int matriz3[][] = new int [linhas][colunas];
			
			for (int i = 0; i < linhas; i++){
				for (int j = 0; j < colunas; j++) {
					for (int k = 0; k < n; k++) {
						matriz3[i][j] = matriz3[i][j] + matriz1[i][k] * matriz2[k][j];
					}
				}
			}
			
			// Impressão da Matriz Resultante
			for (int i = 0; i < linhas; i++) {
				System.out.print("[ ");
				for (int j = 0; j < colunas; j++) {
					System.out.print(matriz3[i][j] + " ");
				}
				System.out.println("]");
			}
			
		}
		
		if (opcao == 3) {
			
		}
		
		else {
			System.out.println("Opção Inválida");
		}
	}
}
