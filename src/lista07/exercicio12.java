package lista07;

import javax.swing.JOptionPane;

/*
 * 
	12) Faça um programa em Java que:
	a) Leia uma frase de 80 caracteres, incluindo brancos; 
	b) Conte quantos brancos existem na frase;
	c) Conte quantas vezes a letra A aparece;
	d) Imprima o que foi calculado nos itens b e c.

 * 
 * */

public class exercicio12 {
	public static void main(String[] args) {
		int contaEspaco = 0, contaLetraA = 0;
		String frase = JOptionPane.showInputDialog("Insira uma frase: ");

		for (char c : frase.toCharArray()) {
			if (c == ' ') {
				contaEspaco++;
			}
			if (c == 'a' || c == 'A') {
				contaLetraA++;
			}
			System.out.println(c);
		}
		System.out.println("Quantidade de Espaços em Branco ==> " + contaEspaco);
		System.out.println("Quantidade de Letras A ==> " + contaLetraA);
	}
}
