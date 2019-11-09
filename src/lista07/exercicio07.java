package lista07;

import javax.swing.JOptionPane;

/*
 * Crie um programa em Java que leia uma palavra.
 * O programa deverá verificar e retornar se a palavra forma um anagrama. 
 * Uma palavra forma um anagrama quando ela é igual ao seu inverso. 
 * Exemplo: palavra: ARARA invertida: ARARA - são anagrama
 * 
 * */

public class exercicio07 {
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
		char[] letra = palavra.toCharArray();
		int contadorIgualdade = 0;

		for (int i = 0, j = (palavra.length() - 1); i < palavra.length(); i++, j--) {
			if (letra[i] == letra[j]) {
				contadorIgualdade++;
			}
		}

		if (contadorIgualdade == palavra.length()) {
			System.out.println("É anagrama");
		} else {
			System.out.println("NÃO é anagrama");
		}

	}
}
