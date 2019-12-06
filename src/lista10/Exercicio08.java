package lista10;

import java.util.Arrays;

public class Exercicio08 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fetuccine(9, -1, -2)));
	}
	public static int[] fetuccine (int n, int a0, int a1) {
		int [] vetor = new int[n];
	
		if (n < 3 ) {
			return vetor;
		}
		
		vetor[0] = a0;
		vetor[1] = a1;
		vetor[2] = a1 - a0;
		
		for (int i = 3; i < n; i++) {
			if (i % 2 == 0) {
				vetor[i] = vetor[i-1] - vetor[i-2];
			}
			else {
				vetor[i] = vetor[i-1] + vetor[i-2];	
			}
		}
		
		return vetor;
	}
}
