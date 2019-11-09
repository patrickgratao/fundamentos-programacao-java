package lista05;

import javax.swing.JOptionPane;

public class exercicio10 {
	public static void main(String[] args) {
		double numero;

		for (int contador = 0; contador < 10; contador++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			
			if (numero > 30) {
				System.out.println(numero);
			}
		}
	}
}
