package lista01;

import javax.swing.JOptionPane;

public class exercicio02 {
	public static void main(String[] args) {
		//Calcular báskara
		double a, b, c, delta;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:"));
		
		delta = (Math.pow(b, 2)) - 4*a*c;
		
		System.out.println("O delta é: "+delta);
	}

}
