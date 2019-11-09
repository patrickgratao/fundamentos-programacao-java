package lista05;

import javax.swing.JOptionPane;

public class exercicio05 {
	public static void main(String[] args) {
		int natural = Integer.parseInt(JOptionPane.showInputDialog("Insira um número natural"));
		double real = Double.parseDouble((JOptionPane.showInputDialog("Insira um número real")));
		
		double potencia = Math.pow(real, natural);
		
		System.out.println(potencia);
	}

}
