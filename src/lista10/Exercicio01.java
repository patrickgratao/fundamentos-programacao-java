package lista10;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercicio01 {

	
	public static void main(String[] args) {
		int[] sorteio = new int[6];
		int[] cartela = new int[6];

		for (int i = 0; i < sorteio.length; i++) {
			sorteio[i] = gerarAleatorio(1, 60);
			
			//Usado para retirar os n�meros repetidos
			for (int j = 0; j < sorteio.length; j++) {
				if (sorteio[i] == sorteio[j]) {
					sorteio[i] = gerarAleatorio(1, 60);
				}
			}
		}

		System.out.println(Arrays.toString(sorteio));

		for (int i = 0; i < cartela.length; i++) {
			cartela[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o valor " + (i + 1)));
		}

		System.out.println(megasena(cartela, sorteio));
	}
	
	public static int gerarAleatorio(int inicio, int fim) {

		int intervalo = fim - inicio + 1;
		int aleatorio = inicio + (int) (Math.random() * intervalo);
		return aleatorio;
	}

	public static int megasena(int[] cartela, int[] sorteio) {
		int contadorAcertos = 0;

		for (int i = 0; i < cartela.length; i++) {
			for (int j = 0; j < sorteio.length; j++) {
				if (cartela[i] == sorteio[j]) {
					contadorAcertos++;
				}
			}
		}

		return contadorAcertos;
	}

}
