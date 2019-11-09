package lista05;

import javax.swing.JOptionPane;

public class exercicio11 {
	public static void main(String[] args) {
		int contadorPares = 0, contadorImpares = 0, contador = 0;
		double numero;
		
		while (contador < 10) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Informe o número"));
			
			if (numero % 2 == 0) {
				contadorPares++;
			}
			else {
				contadorImpares++;
			}
			contador++;
		}
		
		System.out.println("Pares ==> "+contadorPares);
		System.out.println("Ímpares ==> "+contadorImpares);
		
	}
}
