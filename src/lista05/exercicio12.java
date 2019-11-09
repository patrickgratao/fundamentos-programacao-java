package lista05;

import javax.swing.JOptionPane;

public class exercicio12 {
	public static void main(String[] args) {
	
		int numero;
		double soma = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		
		while( numero != 0) {
			if (numero % 5 == 0) {
				soma += numero;
			}
			numero /= 5;
		}
		System.out.println("Soma dos Múltiplos de 5 ==> "+soma);

		
	}
}
