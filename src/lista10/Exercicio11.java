package lista10;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio11 {
	public static void main(String[] args) {
		int [] vetor = {4, 5, 6, 3, 7, 4, 5, 5, 5, 9, 1, 6};
		repeticoes(vetor);
	}
	public static void repeticoes(int[] sequencia) {
		ArrayList<Integer> seq = new ArrayList<Integer>();
		ArrayList<Integer> contRep = new ArrayList<Integer>();
		
		//Colocando o array dentro de um ArrayList
		for (int i = 0; i < sequencia.length; i++) {
			seq.add(sequencia[i]);
		}
		
		// Processando a quantidade de repetições
		for (int i = 0; i < seq.size(); i++) {
			for (int j = 0; j < seq.size(); j++) {
				if (seq.get(i) == seq.get(j)) {
					contRep.add(i, (contRep.get(i)++));
				}
			}
			System.out.printf("%d ocorre %d vezes\n",seq.get(i),contRep.get(i));
		}
	
	}
}
