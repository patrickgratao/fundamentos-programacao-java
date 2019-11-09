package lista03;

import javax.swing.JOptionPane;

public class exercicio14 {
	public static void main (String args[]) {
		double notaPortugues = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota de Portugu�s: "));
		double notaMatematica = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota de matem�tica"));
		double notaConhecimentos = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota de Conhecimentos gerais"));
		
		double mediaFinal = (notaPortugues + notaMatematica + notaConhecimentos) / 3;
		
		if ((mediaFinal >= 7.0) &&    (notaPortugues >= 5.0  && notaMatematica >= 5.0 && notaConhecimentos >= 5.0) ) {
			System.out.println("Candidato Aprovado! M�dia Final: "+mediaFinal);
		}
		
		else {
			System.out.println("Candidato Reprovado!");
		}
		
	}
}
