package lista03;

import javax.swing.JOptionPane;

public class exercicio21 {
	public static void main (String args[]) {
		double num1, num2, num3;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo n�mero"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro n�mero"));
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O primeiro n�mero "+num1+" � maior!");
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo n�mero "+num2+" � maior!");
		}
		
		else {
			System.out.println("O terceiro n�mero "+num3+" � maior!");
		}
		
	}
}
