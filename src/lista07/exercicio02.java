/*
 * 2) Crie um programa em Java que leia dois vetores de 20 posições 
 * e calcule um outro vetor contendo, 
 * nas posições pares os valores do primeiro 
 * e nas posições impares os valores do segundo.
 * */

package lista07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class exercicio02 {
	public static void main(String[] args) {
		int tamanho = 10;

		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];

		int[] vetor3 = new int[tamanho * 2];

		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Vetor\n Elemento " + (i + 1)));
		}
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Segundo Vetor\n Elemento " + (i + 1)));
		}

		// LÓGICA DO PROGRAMA
		for (int i = 0; i < tamanho * 2; i++) {

			if (i % 2 == 0) {
				// Indice Par --> recebe valores do vetor1
				/*
				 * vetor3[0] = vetor1[0];
				 * vetor3[2] = vetor1[1];
				 * vetor3[4] = vetor1[2];
				 */

				// Padrão -> o que se repete
				int padrao = i / 2;
				vetor3[i] = vetor1[padrao];

			}

			else {
				/*
				 * Indice Impar --> recebe valores do vetor2 
				 * vetor3[1] = vetor2[0]; 
				 * vetor3[3] = vetor2[1]; 
				 * vetor3[5] = vetor2[2];
				 */

				// Padrão -> o que se repete
				int padrao = ((i / 2) - (i % 2) + 1);

				vetor3[i] = vetor2[padrao];
			}

		}

		System.out.println("Vetor 1 ==> "+Arrays.toString(vetor1));
		System.out.println("Vetor 2 ==> "+Arrays.toString(vetor2));
		System.out.println("Vetor 3 ==> "+Arrays.toString(vetor3));
	}
}
