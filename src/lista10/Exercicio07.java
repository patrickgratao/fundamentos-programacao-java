package lista10;

import java.util.Arrays;

public class Exercicio07 {
	public static void main(String[] args) {
		int [] vetorA = {1200, 400, 500, 800, 999};
		int [] vetorB = {1150, 4000, 900, 720, 890};
		
		System.out.println(Arrays.toString(vetorA));
		System.out.println(Arrays.toString(vetorB));
		System.out.println(Arrays.toString(justMax(vetorA, vetorB)));
	}
	public static int[] justMax(int[] a, int[] b) {
		int vetorC[] = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			if (a[i] > b[i]) {
				vetorC[i] = a[i];
			}
			else {
				vetorC[i] = b[i];
			}
		}
		return vetorC;
	}
	
}
