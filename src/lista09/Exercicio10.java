package lista09;

import javax.swing.JOptionPane;

public class Exercicio10 {
	
	public static void main(String[] args) {
		int tamanho = 10;
		char [] simbolos = new char[tamanho];
		
		for (int i = 0; i < simbolos.length; i++) {
			simbolos[i] = JOptionPane.showInputDialog("Digite o símbolo desejado "+(i+1)).charAt(0);
		}
		
		imprimirSimbolo(3, simbolos);
	}
	public static void imprimirSimbolo (int quant, char[] simb) {
		// 0 a quantidade
		
		
		for (int i = 0; i < quant; i++) {
			int indiceAleatorio = 0 + (int) (Math.random() * simb.length);
			System.out.println(indiceAleatorio);
			System.out.println(simb[indiceAleatorio]);
		}
	}
}
