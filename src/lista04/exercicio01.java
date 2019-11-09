package lista04;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, mediaFinal;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da segunda nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da terceira nota:"));

		mediaFinal = ((2* nota1) + (3 * nota2) + (5* nota3))/10;
		
		System.out.println("A média final do aluno é: "+mediaFinal);
	}

}
