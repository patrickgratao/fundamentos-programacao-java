package lista05;

import javax.swing.JOptionPane;

public class exercicio03 {
	public static void main(String[] args) {
		
		int quantidadeEntradas = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros ser�o lidos?"));
		
		while (quantidadeEntradas > 0) {
			double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um n�mero"));
			System.out.println("O triplo de "+numero+" = "+numero*3);
			quantidadeEntradas--;
		}
	}

}
