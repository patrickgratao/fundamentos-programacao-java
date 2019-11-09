package lista04;

import javax.swing.JOptionPane;

public class exercicio06 {
	public static void main (String args []) {
		double a, b, c, d, e, f, maior;

		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));
		d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de d"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de e"));
		f = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de f"));
		
		if (a > b && a > c && a > d && a > e && a > f) {
			maior = a;
		}
		
		else if (b > a && b > c && b > d && b > e && b > f) {
			maior = b;
		}
		
		else if (c > a && c > b && c > d && c > e && c > f) {
			maior = c;
		}
		
		else if (d > a && d > b && d > c && d > e && d > f) {
			maior = d;
		}
		
		else if (e > a && e > b && e > c && e > d && e > f) {
			maior = e;
		}
		
		else {
			maior = f;
		}
		
		System.out.println("O maior número é: "+maior);
	}
}
