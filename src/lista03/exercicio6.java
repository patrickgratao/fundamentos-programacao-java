package lista03;

import javax.swing.JOptionPane;

public class exercicio6 {
	public static void main (String[] args) {
		double nota1, nota2, mediaFinal;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 1"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 2"));
		
		mediaFinal = (nota1 + nota2)/2;
		
		System.out.println("M�dia Final: "+mediaFinal);
		
		if (mediaFinal >= 7.0) {
			System.out.println("APROVADO!");
		}
		
		else if (mediaFinal < 3.0) {
			System.out.println("REPROVADO!");
		}
		
		else {
			System.out.println("Em Recupera��o!");
		}
		
		
	}
}
