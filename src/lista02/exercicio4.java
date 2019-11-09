package lista02;

import javax.swing.JOptionPane;

public class exercicio4 {
	public static void main(String[] args) {
		double votosTotais; //Quantidade de votos v�lidos obtidos pelo candidato
		double votosValidosDocentes; //Votos v�lidos dos docentes ao candidato
		double votosValidosDiscentes; //Votos v�lidos dos DISCENTES ao Candidato
		double votosTotaisDocentes; //Total de Votos V�lidos dos Docentes
		double votosTotaisDiscentes; //Total de votos v�lidos dos Discentes
		
		//Entrada do n�mero de votos v�lidos dos Docentes ao Candidato
		votosValidosDocentes = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos válidos dos DOCENTES ao Candidato"));
		//Entrada  do Total de votos v�lidos dos Docentes
		votosTotaisDocentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o TOTAL de votos válidos dos DOCENTES: "));
		//Entrada do n�mero de votos v�lidos dos Discentes ao Candidato
		votosValidosDiscentes = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos válidos dos DISCENTES ao Candidato: "));
		//Entrada do Total de votos v�lidos dos Discentes
		votosTotaisDiscentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o TOTAL de votos válidos dos DISCENTES"));
		
		//C�lculo dos votos
		votosTotais = ((2.0/3.0)* (votosValidosDocentes/votosTotaisDocentes)) + ((1.0/3.0) * (votosValidosDiscentes/votosTotaisDiscentes));
		votosTotais *= 100; 

		//Imprindo na tela o calculo dos votos
		System.out.println("O candidato recebeu "+votosTotais+" % dos votos válidos.");
	}
}