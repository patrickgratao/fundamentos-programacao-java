package lista05;

import javax.swing.JOptionPane;

public class exercicio21 {
	public static void main(String[] args) {
		double potencia = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de n?"));
		double resultado = 0.0;
		
		for (int controle = 1; controle <= potencia; controle++) {
			resultado += Math.pow(controle, controle);
		}
		
		System.out.println(resultado);
	}
}
