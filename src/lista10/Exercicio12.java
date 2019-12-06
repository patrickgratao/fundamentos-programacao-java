package lista10;

import java.util.Arrays;

public class Exercicio12 {
	
	public static void main(String[] args) {
		int n = 6;
		System.out.printf("Linha %d do Triângulo de Pascal => %s\n",n,Arrays.toString(pascal(n)));
	}
	public static int[] pascal(int n) {
		int[] vpascal = new int[900];
		int[] vetor = new int[n];
		// Toda primeira posicao começa com 1
		vpascal[0] = 1;
		for (int i = 0; i <= n; i++) {
			int aux1 = 0, aux2;
			for (int j = 0; j < i; j++) {
				aux2 = aux1 + vpascal[j];
				aux1 = vpascal[j];
				vpascal[j] = aux2;
			}
		}
		// Armazenando os dados no vetor que será retornado
		for (int i = n-1, j = 0; ((i <= n) && (i != -1)); i--, j++) {
			vetor[j] = vpascal[i];
		}
		
		return vetor;
	}
}
