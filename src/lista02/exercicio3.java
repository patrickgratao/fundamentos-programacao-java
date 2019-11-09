package lista02;

import javax.swing.JOptionPane;

public class exercicio3 {
	public static void main(String[] args) {
		double votosTotais; //Quantidade de votos válidos obtidos pelo candidato
		double votosValidosDocentes; //Votos válidos dos docentes ao candidato
		double votosValidosDiscentes; //Votos válidos dos DISCENTES ao Candidato
		double votosTotaisDocentes; //Total de Votos Válidos dos Docentes
		double votosTotaisDiscentes; //Total de votos válidos dos Discentes
		
		//Entrada do número de votos válidos dos Docentes ao Candidato
		votosValidosDocentes = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos válidos dos DOCENTES ao Candidato"));
		//Entrada  do Total de votos válidos dos Docentes
		votosTotaisDocentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o TOTAL de votos válidos dos DOCENTES: "));
		//Entrada do número de votos válidos dos Discentes ao Candidato
		votosValidosDiscentes = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos válidos dos DISCENTES ao Candidato: "));
		//Entrada do Total de votos válidos dos Discentes
		votosTotaisDiscentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o TOTAL de votos válidos dos DISCENTES"));
		
		//Cálculo dos votos
		votosTotais = ((2/3)* (votosValidosDocentes/votosTotaisDocentes)) + ((1/3) * (votosValidosDiscentes/votosTotaisDiscentes));

		//Imprindo na tela o calculo dos votos
		System.out.println("O candidato recebeu "+votosTotais+" votos válidos.");

	}

}
