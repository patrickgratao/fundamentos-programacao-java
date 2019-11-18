/**
 * 2) Crie um programa em Java que leia dois vetores de 20 posições 
 * e calcule um outro vetor contendo, nas posições pares 
 * os valores do primeiro e nas posições impares os valores do segundo.
 * 
 * 
 * */

package provaSubstitutiva;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		int tamanho = 20;
		int vetor1[] = new int[tamanho];
		int vetor2[] = new int[tamanho];
		int vetor3[] = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 1\nDigite o valor de " + i));
		}
		
		for (int i = 0; i < tamanho; i++) {
			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 2\nDigite o valor de " + i));
		}
		
		for (int i = 0; i < tamanho; i++) {
		//	for (int j = 0; j < tamanho; j++)
		}
		
		
		/*
		 * vetor3[0] = vetor1[0];
		 * vetor3[1] = vetor2[0];
		 * vetor3[2] = vetor1[1];
		 * vetor3[3] = vetor2[1];
		 * 
		 * */
		
		
	}

}
