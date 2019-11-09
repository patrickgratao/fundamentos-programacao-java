package lista03;

import javax.swing.JOptionPane;

public class exercicio17 {
	public static void main (String args[]) {
		int a, b, c, soma;

		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A soma de "+a+" + "+b+" � maior que "+c);
		}
		
		else if (soma < c) {
			System.out.println("A soma de "+a+" + "+b+" � menor que "+c);
		}
		
		else {
			System.out.println("A soma de "+a+" + "+b+" � igual a "+c);
		}
	
	}
}
