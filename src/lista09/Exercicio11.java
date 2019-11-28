package lista09;

public class Exercicio11 {

	public static void main(String[] args) {
		for (int seq : serie(12)) {
			System.out.print("  " + seq);
		}
	}

	public static int[] serie(int n) {
		int[] sequencia = new int[n];
		int auxiliarSeq = 0;
		int auxiliarRep = 4;

		for (int i = 0; i < n; i++) {
			if (i % 3 == 0) {
				sequencia[i] = auxiliarSeq + 1;
				auxiliarSeq++;
				auxiliarRep++;
			} 
			else {
				sequencia[i] = auxiliarRep - 1;
			}
		}
		return sequencia;
	}
}
