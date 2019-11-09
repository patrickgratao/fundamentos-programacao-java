package lista03;

import javax.swing.JOptionPane;

public class exercicio19 {
	public static void main (String args[]) {
		int numeroConta;
		double saldoInicial, saldoFinal, valorOperacao;
		String [] opcoes = new String[] {"Depósito", "Retirada"};
		int respostaOpcoes;
		boolean contaEstourada = false;
		
		numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da Conta"));
		saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual o saldo inicial ? "));
		
		respostaOpcoes = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", "Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
		String tipoOperacao = (respostaOpcoes == 0) ? "depositar" : "sacar";
		valorOperacao = Double.parseDouble(JOptionPane.showInputDialog("Qual valor você deseja "+tipoOperacao));
		
		//Deposito
		if (respostaOpcoes == 0) {
			saldoFinal = saldoInicial + valorOperacao;
		}
		
		//Retirada
		else {
			saldoFinal = saldoInicial - valorOperacao;
			
			if (saldoFinal < 0) {
				contaEstourada = true;
			}
		}
		
		System.out.println("O seu saldo é ==> "+saldoFinal);
		
		if (contaEstourada) {
			System.out.println("Conta estourada!");
		}

	}

}
