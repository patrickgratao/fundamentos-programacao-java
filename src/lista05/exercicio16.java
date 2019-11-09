package lista05;

import javax.swing.JOptionPane;

public class exercicio16 {
	public static void main(String[] args) {
		double numero, maior = 0;
		int quantidadeEntradas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de entradas:"));
		
		while (quantidadeEntradas > 0) {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			
			if (numero > maior) {
				maior = numero;
			}
			
			quantidadeEntradas--;
		}
		System.out.println("Maior número ==> "+maior);
	}
}
