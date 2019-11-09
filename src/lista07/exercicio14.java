/*
 * Em uma corrida há 10 corredores, de número de inscrição de 1 a 10. 
 * Faça um programa em Java que leia os valores do número do corredor e o seu respectivo tempo na corrida. 
 * Além disso, o programa deve imprimir a qualificação e o tempo de corrida, 
 * do primeiro ao décimo colocado, identificando o número de inscrição do corredor referente àquela colocação. 
 * Suponha que não há tempos iguais.
 * 
 * */

package lista07;

import javax.swing.JOptionPane;

public class exercicio14 {

	public static void main(String[] args) {
		int tamanho = 3;

		// Variáveis auxiliares para troca
		int auxiliarNumero;
		double auxiliarTempo;

		int[] numeroInscricao = new int[tamanho];
		double[] tempo = new double[tamanho];

		// Preenchimento dos Arrays
		for (int i = 0; i < tamanho; i++) {
			numeroInscricao[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de Inscrição"));
			tempo[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do atleta"));
		}

		for (int i = 0; i < (tamanho); i++) {
			for (int j = 0; j < (tamanho - 1); j++) {
				if (tempo[j] > tempo[j + 1]) {
					// Guarda o tempo[] em uma auxiliar para essa informação não desaparecer
					auxiliarTempo = tempo[j];
					// Atribui o tempo[j+1] a tempo[i] // passa o tempo menor para a menor posição
					tempo[j] = tempo[j + 1];
					// Atribui o tempo[j] a tempo[i+1] // passa o tempo maior para a maior posição
					tempo[j + 1] = auxiliarTempo;

					// Guarda o numero do Atleta[i] em uma auxiliar para essa informação não
					// desaparecer
					auxiliarNumero = numeroInscricao[j];
					numeroInscricao[j] = numeroInscricao[j + 1];
					numeroInscricao[j + 1] = auxiliarNumero;
				}
			}
		}

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("O %d lugar é do candidato numero %d com o tempo %2f\n", (1+i), numeroInscricao[i], tempo[i]);
		}

	}

}
