/*
 * A matriz x, de 10 linhas e quatro colunas, cont�m informa��es sobre alunos de uma
universidade. 

Os elementos da primeira, segunda, terceira e quarta colunas s�o,
respectivamente, 
	o n�mero de matr�cula, 
	sexo (0 ou 1), 
	n�mero do curso
	m�dia geral no curso. 
	
Fa�a um algoritmo que:
a. leia as informa��es sobre os 10 alunos;
b. determine e imprima o n�mero de matr�cula do aluno de sexo 1, curso 153 que
obteve a melhor m�dia. Supor a inexist�ncia de empate. 
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

		// Grava��o de Dados
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (j == 0) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog("Insira o N�mero de Matr�cula do aluno " + (i + 1));
				}
				if (j == 1) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog(
							"Insira o Sexo do aluno " + (i + 1) + "\nDigite apenas 0 - Masculino e 1 - Feminino");
				}
				if (j == 2) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog("Insira o N�mero do Curso do Aluno " + (i + 1));
				}
				if (j == 3) {
					dadosAlunos[i][j] = JOptionPane.showInputDialog("Insira a m�dia geral do aluno " + (i + 1));
					if (dadosAlunos[i][1].equals("1") && dadosAlunos[i][2].equals("153")) {

						if (Double.parseDouble(dadosAlunos[i][j]) > maiorMedia) {
							maiorMedia = Double.parseDouble(dadosAlunos[i][j]);
							alunoDestaque = Integer.parseInt(dadosAlunos[i][0]);
						}
					}

				}
			}
		}

		System.out.println("A matr�cucula do Aluno Destaque � => " + alunoDestaque);

		//
	}
}
