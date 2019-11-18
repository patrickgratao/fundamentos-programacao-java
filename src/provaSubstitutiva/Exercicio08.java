/*
 * 8) Crie um programa em Java que leia a pontuação de 10 provas 
 * de um concurso e os nomes dos respectivos participantes. 
 * Grave os dados em um vetor. Apresente um ranking dos colocados que obtiveram mais de 70 pontos.

 * */

package provaSubstitutiva;

import javax.swing.JOptionPane;

public class Exercicio08 {
	public static void main(String[] args) {
		int tamanho = 5;
		double [] notas = new double[tamanho];
		String [] nome = new String[tamanho];
		double notaAuxiliar;
		String nomeAuxiliar;
		
		for (int i = 0; i < tamanho; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite o nome do participante "+(i+1));
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do "+nome[i]));
		}
		
		//Algoritimo de Ordenação
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < (tamanho - 1); j++) {
				if (notas[j] < notas[j+1]) {
					notaAuxiliar = notas[j];
					notas[j] = notas[j+1];
					notas[j+1] = notaAuxiliar;
					
					nomeAuxiliar = nome[j];
					nome[j] = nome[j+1];
					nome[j+1] = nomeAuxiliar;
				}
			}
		}
		
		//Mais de 70 pontos
		for (int i = 0; i <  tamanho; i++) {
			if (notas[i] >= 70.0) {
				System.out.printf("O %d lugar é do candidato %s com a nota %.2f\n", (i+1), nome[i], notas[i]);
			} 
		}
	}

}
