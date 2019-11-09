package lista04;

import javax.swing.JOptionPane;

public class exercicio07 {
	public static void main (String args []) {
		double imc, altura, peso;
		String situacao;

		peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso em kg"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura em m"));
		
		imc = peso / (altura * altura);
		
		if (imc < 20) {
			situacao = "Abaixo do Peso";
		}
		else if (imc >= 20 && imc < 25) {
			situacao = "Peso Normal";
		}
		
		else if (imc >= 25 && imc < 30) {
			situacao = "Sobre Peso";
		}
		
		else if (imc >= 30 && imc < 40) {
			situacao = "Obeso";
		}
		
		else {
			situacao = "Obeso mórbido";
		}
		
		System.out.println("IMC => "+imc+" você está "+situacao);
	}
}
