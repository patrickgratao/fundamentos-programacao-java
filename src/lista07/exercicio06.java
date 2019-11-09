/*
 * Faça um programa em Java que crie um vetor de 26 elementos do tipo String.
 *  Cada elemento do vetor deve conter uma letra do alfabeto, onde o seu índice
 *   é dado pela ordem da letra no alfabeto (exemplo: ‘A’ = 1, ‘B’ = 2, ‘C’ = 3, ...). 
 *   Imprima os índices: 18; 7; 0; 17; 8; 13; 6; 0; 13.
 */

package lista07;

import javax.swing.JOptionPane;

public class exercicio06 {
	public static void main(String[] args) {
		int tamanho = 26;
		String[] alfabeto = new String[tamanho];

		for (int i = 0; i < tamanho; i++) {
			alfabeto[i] = JOptionPane.showInputDialog("Digite a Letra " + (i+1) + " do alfabeto");
		}

		System.out.print(alfabeto[18]);
		System.out.print(alfabeto[7]);
		System.out.print(alfabeto[0]);
		System.out.print(alfabeto[17]);
		System.out.print(alfabeto[8]);
		System.out.print(alfabeto[13]);
		System.out.print(alfabeto[6]);
		System.out.print(alfabeto[0]);
		System.out.print(alfabeto[13]);
	}
}