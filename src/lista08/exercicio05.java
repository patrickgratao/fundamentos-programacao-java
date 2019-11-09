/*
 * A matriz x, de 10 linhas e quatro colunas, contém informações sobre alunos de uma
universidade. 

Os elementos da primeira, segunda, terceira e quarta colunas são,
respectivamente, 
	o número de matrícula, 
	sexo (0 ou 1), 
	número do curso
	média geral no curso. 
	
Faça um algoritmo que:
a. leia as informações sobre os 10 alunos;
b. determine e imprima o número de matrícula do aluno de sexo 1, curso 153 que
obteve a melhor média. Supor a inexistência de empate. 
 * 
 * */

package lista08;

import javax.swing.JOptionPane;

public class exercicio05 {
	public static void main(String[] args) {
		int linhas = 10, colunas = 4;
		String[][] dadosAlunos = new String[linhas][colunas];
		double maiorMedia = 0.0;
		int alunoDestaque = 0;

		// Gravação de Dados
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (j == 0) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog("Insira o Número de Matrícula do aluno " + (i + 1));
				}
				if (j == 1) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog(
							"Insira o Sexo do aluno " + (i + 1) + "\nDigite apenas 0 - Masculino e 1 - Feminino");
				}
				if (j == 2) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog("Insira o Número do Curso do Aluno " + (i + 1));
				}
				if (j == 3) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog("Insira a média geral do aluno " + (i + 1));
					if (dadosAlunos[i][1].equals("1") && dadosAlunos[i][2].equals("153")) {

						if (Double.parseDouble(dadosAlunos[i][j]) > maiorMedia) {
							maiorMedia = Double.parseDouble(dadosAlunos[i][j]);
							alunoDestaque = Integer.parseInt(dadosAlunos[i][0]);
						}
					}

				}
			}
		}

		System.out.println("A matrícucula do Aluno Destaque é => " + alunoDestaque);

		//
	}
}
