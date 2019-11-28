package lista09;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		int vetor[] = {8 , 12, 5, 4, 10, 90, 89, 777, 89, 10}; 
		vetor = new int[10];
		System.out.println(max(vetor));
	}
	
	public static int max(int[] n) {
		int maior = -4444;
		for (int i = 0; i < n.length; i++) {
			if (n[i] < n[i+1]) {
				maior = n[i+1];
			}
			else {
				maior = n[i];
			}
		}
		return maior;
	}
}
