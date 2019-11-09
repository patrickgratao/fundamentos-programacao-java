package lista03;

import javax.swing.JOptionPane;

public class exercicio15 {
	public static void main (String args[]) {
		double valorVenda, comissao, bonusCorretor, valorTotalVendas, valorTotalBonus;
		int decisao = JOptionPane.YES_OPTION;
		
		valorTotalVendas = 0;
		valorTotalBonus = 0;
		
		while (decisao == JOptionPane.YES_OPTION) {
		
			valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda"));
			
			if (valorVenda > 50000) {
				comissao = 12.0 / 100;
			}
			
			else if (valorVenda >= 30000 && valorVenda <= 50000) {
				comissao = 9.5 / 100;
			}
			
			else {
				comissao = 7.0 / 100;
			}
			bonusCorretor = valorVenda * comissao;
			System.out.println("Valor da Venda => "+valorVenda+" | Bônus do Corretor => "+bonusCorretor);
			
			valorTotalVendas += valorVenda;
		    valorTotalBonus += bonusCorretor;
		
		    //Controle do programa
	        decisao = JOptionPane.showConfirmDialog(null, "Você quer continuar lançando vendas ?", "Lançamentos", JOptionPane.YES_NO_OPTION);
		
	       
		}
		
		System.out.println("\n=================\n");
		System.out.println("Valor total em vendas: "+valorTotalVendas);
		System.out.println("Valor total pago em bonus: "+valorTotalBonus);
		
		
	}
}
