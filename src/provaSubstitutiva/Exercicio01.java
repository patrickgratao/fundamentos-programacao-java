package provaSubstitutiva;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static String lerEntrada() {
		return JOptionPane.showInputDialog(
				"Digite o número correspondente ao prato\n\n1 -	Carne de Sol na Brasa\n2- Picanha Maturada na Brasa\n"
						+ "3 - Omelete de Carne de Sol\n4- Queijo do Sertão\n5- Batata Frita\n6- Bolinho de Arroz\n7- Torresmo\n8 - Peito de Frango à Milanesa à Palito\n"
						+ "9- Filé de Peixe à Milanesa\n10- Arroz\n11- Feijão Verde\n12- Mandioca Cozida\n 0 - SAIR");
	}

	public static void main(String[] args) {

		ArrayList<Integer> alimentos = new ArrayList<Integer>();
		ArrayList<String> alimentosNome = new ArrayList<String>();

		int opcao;
		double valorTotal = 0;

		opcao = Integer.parseInt(lerEntrada());

		while (opcao < 0 || opcao > 12) {
			JOptionPane.showMessageDialog(null, "Opção Inválida");
			opcao = Integer.parseInt(lerEntrada());
		}

		while (opcao != 0) {
			alimentos.add(opcao);
			opcao = Integer.parseInt(lerEntrada());
			
			while (opcao < 0 || opcao > 12) {
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				opcao = Integer.parseInt(lerEntrada());
			}

		}

		for (int i = 0; i < alimentos.size(); i++) {
			switch (alimentos.get(i)) {
			case 1:
				alimentosNome.add("Carne de Sol na Brasa");
				valorTotal += 46.80;
				break;
			case 2:
				alimentosNome.add("Picanha Maturada na Brasa");
				valorTotal += 72.45;
				break;
			case 3:
				alimentosNome.add("Omelete de Carne de sol");
				valorTotal += 22.50;
				break;
			case 4:
				alimentosNome.add("Queijo do Sertão");
				valorTotal += 16.99;
				break;
			case 5:
				alimentosNome.add("Batata frita");
				valorTotal += 11.80;
				break;
			case 6:
				alimentosNome.add("Bolinho de Arroz");
				valorTotal += 24.69;
				break;
			case 7:
				alimentosNome.add("Torresmo");
				valorTotal += 7.89;
				break;
			case 8:
				alimentosNome.add("Peito de Frango à Milanesa à Palito");
				valorTotal += 36.45;
				break;
			case 9:
				alimentosNome.add("Filé de Peixe à Milanesa");
				valorTotal += 42.00;
				break;
			case 10:
				alimentosNome.add("Arroz");
				valorTotal += 8.50;
				break;
			case 11:
				alimentosNome.add("Feijão Verde");
				valorTotal += 7.00;
				break;
			case 12:
				alimentosNome.add("Mandioca Cozida");
				valorTotal += 12.00;
				break;

			default:
				alimentosNome.add("Opção Inválida");
				break;
			}
		}

		double valorTotalGorgeta = valorTotal * 1.10;

		System.out.println("Alimentos ==> " + alimentosNome);
		System.out.println("Valor Total sem Gorjeta ==> " + valorTotal);
		System.out.println("Valor Total com Gorjeta ==> " + valorTotalGorgeta);

	}
}