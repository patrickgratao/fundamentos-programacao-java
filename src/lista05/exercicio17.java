package lista05;

import javax.swing.JOptionPane;

public class exercicio17 {
	public static void main(String[] args) {
		double numero, menor = 9999999;
		int quantidadeEntradas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de entradas:"));
		
		while (quantidadeEntradas > 0) {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			
			if (numero < menor) {
				menor = numero;
			}
			
			quantidadeEntradas--;
		}
		System.out.println("Menor número ==> "+menor);
	}
}
