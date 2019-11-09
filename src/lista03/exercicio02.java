package lista03;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		double reajuste, salarioInicial, salarioFinal, bonus;
		
		reajuste = (105.0/100.0);
		bonus = 100.0;
		
		salarioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio inicial:"));
		
		salarioFinal = salarioInicial * reajuste;
		
		if (salarioInicial  <= 750.0) {
			salarioFinal += bonus;
			System.out.println("O sal�rio final �h de: "+salarioFinal);
		}
		
		else {
			System.out.println("O sal�rio final �h de: "+salarioFinal);
		}

	}

}
