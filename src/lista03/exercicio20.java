package lista03;

import javax.swing.JOptionPane;

public class exercicio20 {
	public static void main (String args[]) {
		double valorDiaria = 60.00, valorTotal;
		double taxaServicos = 0;
		int quantidadeDiarias;
		
		quantidadeDiarias = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de di�rias"));
		
		if (quantidadeDiarias > 15 ) {
			taxaServicos = 5.5;
			
		}
		
		else if (quantidadeDiarias == 15 ) {
			taxaServicos = 6.0;
		}
		
		else {
			taxaServicos = 8.0;
		}
		
		
		valorTotal = (valorDiaria * quantidadeDiarias ) + (taxaServicos * quantidadeDiarias);
		System.out.println("O valor total da estadia � ==> "+valorTotal);
	}
}
