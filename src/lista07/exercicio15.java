package lista07;

import javax.swing.JOptionPane;

/*
 *  Faça um programa em Java que, dados dois vetores inteiros A e B de 20 elementos,
efetue as respectivas operações indicadas por um outro vetor C de 20 elementos de
caracteres, também fornecido pelo usuário, contendo as quatro operações aritméticas em
qualquer combinação e armazenando os resultados em um quarto vetor D. Por exemplo,
suponha que A[1] = 10, B[1] = 3 e C[1] = '*', então D[1] = 30.
 * 
 * */

public class exercicio15 {
	public static void main(String[] args) {
		int tamanho = 5;
		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		char[] vetorC = new char[tamanho];
		int[] vetorD = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro valor inteiro"));
			vetorC[i] = JOptionPane
					.showInputDialog(
							"Digite um operador\n+ => Adição\n - => Subtração \n* => Multiplicação\n/ => Divisão")
					.charAt(0);
		}

		for (int i = 0; i < tamanho; i++) {
			switch (vetorC[i]) {
			case '+':
				vetorD[i] = vetorA[i] + vetorB[i];
				break;
			case '-':
				vetorD[i] = vetorA[i] - vetorB[i];
				break;

			case '*':
				vetorD[i] = vetorA[i] * vetorB[i];
				break;
			case '/':
				vetorD[i] = vetorA[i] / vetorB[i];
				break;
			}
		}

		for (int i = 0; i < tamanho; i++) {
			System.out.println(vetorA[i] + " " + vetorC[i] + " " + vetorB[i] + " => " + vetorD[i]);
		}
	}
}
