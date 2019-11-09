package lista07;

import javax.swing.JOptionPane;

/*
 * Crie um programa em Java que leia a pontuação de 10 provas de um concurso e os
	nomes dos respectivos participantes. Grave os dados em um vetor. Apresente um
	ranking dos colocados que obtiveram mais de 70 pontos. 
 * */

public class exercicio08 {
	public static void main(String[] args) {
		int tamanho = 10;
		String auxiliarNome;
		double auxiliarNota;

		String[] nome = new String[tamanho];
		double[] nota = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {
			nome[i] = JOptionPane.showInputDialog("Informe o nome do candidato" + (i + 1));
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do candidato" + (i + 1)));
		}

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < (tamanho - 1); j++) {
				if (nota[j] < nota[j + 1]) {
					//Ordenando o Vetor com as notas maiores na frente
					auxiliarNota = nota[j];
					nota[j] = nota[j + 1];
					nota[j + 1] = auxiliarNota;
					
					//Fazendo o mesmo para o vetor nome acompanhe a nota
					auxiliarNome = nome[j];
					nome[j] = nome[j + 1];
					nome[j + 1] = auxiliarNome;

				}
			}
		}

		for (int i = 0; i < tamanho; i++) {
			// Nota maior que 70 pontos
			if (nota[i] >= 70.0) {
				System.out.printf("O %d lugar é de %s com a nota %2f\n", (1 + i), nome[i], nota[i]);
			}
		}

	}
}
