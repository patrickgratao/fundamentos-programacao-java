package lista01;

import javax.swing.JOptionPane;

public class exercicio03 {

	public static void main(String[] args) {
		//Calculo da Base área do trapézio
		
		double baseMaior, baseMenor, altura, area;
		
		baseMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base maior: "));
		baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base menor: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		area = ((baseMaior+baseMenor)*altura)/2;
		
		System.out.println("A área do trapézio é: "+area);
		
	}

}
