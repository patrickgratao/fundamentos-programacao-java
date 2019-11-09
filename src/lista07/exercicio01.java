package lista07;

import javax.swing.JOptionPane;

public class exercicio01 {
	public static void main(String[] args) {
		int tamanho = 5, contadorPares = 0;
		int [] vetor = new int [tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		
			if (vetor[i] % 2 == 0) {
				contadorPares++;
			}
		}
		
		System.out.println("A quantidade de números pares é ==> "+contadorPares);
	}
}
