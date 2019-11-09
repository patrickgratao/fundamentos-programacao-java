package n1;

import javax.swing.JOptionPane;

public class exercicio02 {
	public static void main (String args []) {
		String nomeHospede, tipoApartamento;
		int numeroDiarias;
		double valorConsumo, valorDiaria, valorTotalDiarias, subTotal, taxaServico, totalGeral;
		
		valorDiaria = -1;
		
		nomeHospede = JOptionPane.showInputDialog("Qual o nome do hóspede?");
		tipoApartamento = JOptionPane.showInputDialog("Informe o tipo de Apartamento => A B C ou D");
		numeroDiarias = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de diárias: "));
		valorConsumo = Double.parseDouble(JOptionPane.showInputDialog("Consumo do hóspede")); 
		
		switch (tipoApartamento) {
		case "A":
			valorDiaria = 150;
			break;

		case "B":
			valorDiaria = 100;
			break;

		case "C":
			valorDiaria = 75;
			break;

		case "D":
			valorDiaria = 40;
			break;

		default:
			System.out.println("Este tipo de apartamento não existe");
			break;
		}

		valorTotalDiarias = numeroDiarias * valorDiaria;
		subTotal = valorTotalDiarias + valorConsumo;
		taxaServico = (10.0/100.0) * subTotal;
		totalGeral = subTotal + taxaServico; 
		
		//Impressões na tela
		System.out.println("Nome do Hóspede ==> "+nomeHospede);
		System.out.println("Tipo de Apartamento ==> "+tipoApartamento);
		System.out.println("Número de Diárias ==> "+numeroDiarias);
		System.out.println("Valor Unitário da Diária ==> "+valorDiaria);
		System.out.println("Valor total das diárias ==> "+valorTotalDiarias);
		System.out.println("Valor do Consumo Interno ==> "+valorConsumo);
		System.out.println("Subtotal ==> "+subTotal);
		System.out.println("Taxa de Serviço ==> "+taxaServico);
		System.out.println("Total Geral ==> "+totalGeral);
		
	}
}
