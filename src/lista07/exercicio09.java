package lista07;

import javax.swing.JOptionPane;

public class exercicio09 {
	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que leia quinze números do usuário e armazene em um
		 * vetor a raiz quadrada de cada número. Caso o valor digitado seja menor que
		 * zero o número –1 deve ser atribuído ao elemento do vetor. Após isso, o
		 * programa deve imprimir todos os valores armazenados. Use o método
		 * Math.sqrt(x) para calcular a raiz quadrada de um número.
		 */

		int tamanho = 15;
		double[] vetor = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {
			Double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
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
