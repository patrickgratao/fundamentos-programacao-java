package lista04;

import javax.swing.JOptionPane;
public class exercicio04 {
	public static void main (String args []) {
		long numero = Long.parseLong(JOptionPane.showInputDialog("Insira um número: "));
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		}
		
		else {
			System.out.println("Ímpar");
		}
	}

}
