package lista04;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main (String args [] ) {
		double a, b, c, d, e, f, x, y;

		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));
		d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de d"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de e"));
		f = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de f"));
		
		x = ((c*e) - (b*f)) / (a*e) - (b*d);
		
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));

		System.out.println("O valor de x é ==> "+x);
		System.out.println("O valor de y é ==> "+y);
	}
}
