package lista05;

import javax.swing.JOptionPane;

public class exercicio26 {
	public static void main (String[] args) {
		double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Saldo Inicial"));
		double valorOperacao = Double.parseDouble(JOptionPane.showInputDialog("Opera��o: "));
		double somaCredito = 0;
		double somaDebito = 0;
		double impostoCpmf =0;
		double saldoFinal = 0;
		
		while (valorOperacao != 0 ) {
			if (valorOperacao < 0) {
				somaDebito += valorOperacao * -1;
			}
			else {
				somaCredito += valorOperacao;
			}
			
			valorOperacao = Double.parseDouble(JOptionPane.showInputDialog("Opera��o: "));
		}
		
		impostoCpmf = 0.35/100.0 * somaDebito;
		saldoFinal = saldoInicial + somaCredito - somaDebito - impostoCpmf;
		

		System.out.println("Total de cr�ditos => "+somaCredito);
		System.out.println("Total de D�bitos ==> "+somaDebito);
		System.out.println("C.P.M.F paga => "+impostoCpmf);
		System.out.println("Saldo Final => "+saldoFinal);
	}

}
