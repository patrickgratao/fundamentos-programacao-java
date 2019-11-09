package lista05;

import javax.swing.JOptionPane;

public class exercicio14 {
	public static void main(String[] args) {

		double numero, media, soma = 0;
		
		for (int contador = 0; contador < 5; contador ++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));
			soma += numero;
		}
	
		media = soma / 5;
		System.out.println("Média dos Números ==> "+media);
	}
}
