package lista03;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real: "));
		
		if (valor < 0) {
			System.out.println("O valor absoluto de "+valor+" �h: "+valor*-1);
		}
		
		else {
			System.out.println("O valor absoluto de "+valor+" �h: "+valor);
		}
	}

}
