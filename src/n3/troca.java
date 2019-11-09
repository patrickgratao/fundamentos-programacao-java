package n3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class troca {

	/* VALIDAÇOES */

	static String validaEntradaDados(String mensagem, int i) {
		String entradaInfos;
		// Entrada Comum
		if (i == -1) {
			entradaInfos = JOptionPane.showInputDialog(mensagem);
			while (entradaInfos.equals("")) {
				entradaInfos = JOptionPane.showInputDialog("Digite um Número Inteiro\n" + mensagem);
			}
		}
		// ArrayList
		else {
			entradaInfos = JOptionPane.showInputDialog(mensagem + " " + (i + 1));
			while (entradaInfos.equals("")) {
				entradaInfos = JOptionPane.showInputDialog("Digite um Número Inteiro\n" + mensagem + "" + (i + 1));
			}
		}

		return entradaInfos;
	}

	public static void main(String[] args) {
		int qtdCartas, qtdTrocas;

		ArrayList<Integer> viradoCima = new ArrayList<Integer>();
		ArrayList<Integer> temporario = new ArrayList<Integer>();
		ArrayList<Integer> viradoBaixo = new ArrayList<Integer>();

		// Leitura da Quantidade de Cartas e Quantidade de Trocas
		qtdCartas = Integer.parseInt(validaEntradaDados("Informe a quantidade de cartas ", -1));

		qtdTrocas = Integer.parseInt(validaEntradaDados("Informe a quantidade de trocas ", -1));

		/*
		 * PREENCHIMENTO DOS ARRAY LISTS
		 */

		// ArrayList Virado Para Cima
		for (int i = 0; i < qtdCartas; i++) {
			viradoCima.add(Integer.parseInt(validaEntradaDados("Lado de Cima \n Carta ", i)));
		}

		// Arraylist Virado Para Baixo
		for (int i = 0; i < qtdCartas; i++) {
			viradoBaixo.add(Integer.parseInt(validaEntradaDados("Lado de Baixo \n Carta ", i)));

		}
		// ArrayList temporário;
		// É a cópia do ArrayList Virado para Cima
		for (int i = 0; i < viradoCima.size(); i++) {
			temporario.add(viradoCima.get(i));
		}

		/*
		 * TROCAS
		 */
		for (int i = 0; i < qtdTrocas; i++) {
			int de = Integer.parseInt(validaEntradaDados("De: ", -1));
			int ate = Integer.parseInt(validaEntradaDados("Até: ", -1));

			int qtdMovimentos = ate - de + 1;
			int posicao = de - 1;
			int contador = 0;

			while (contador < qtdMovimentos) {
				viradoCima.set(posicao, viradoBaixo.get(posicao));
				viradoBaixo.set(posicao, temporario.get(posicao));
				temporario.set(posicao, viradoCima.get(posicao)); // Muito importante para a proxima troca

				contador++;
				posicao++;
			}

		}

		JOptionPane.showMessageDialog(null, "Cartas viradas para cima\n" + viradoCima.toString());
		/*
		 * DEBUG
		 */
		// System.out.println(viradoCima.toString());
		// System.out.println(viradoBaixo.toString());
		// System.out.println(temporario.toString());
	}
}