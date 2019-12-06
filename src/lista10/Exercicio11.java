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
		int[] contRep = new int[sequencia.length];
		ArrayList<Integer> contaRep = new ArrayList<Integer>();
		
		// Colocando a sequencia dentro de um Arraylist
		for (int i = 0; i < sequencia.length; i++) {
			seq.add(sequencia[i]);
		}
	
		// Conta a quantidade de repetições
		for (int i = 0; i < seq.size(); i++) {
			for (int j = 0; j < seq.size(); j++) {
				if (seq.get(i) == seq.get(j)) {
					contRep[i] += 1;
				}
			}
		}
		
		//Colocando ContRep dentro de um ArrayList
		for (int i = 0; i < contRep.length; i++) {
			contaRep.add(i, contRep[i]);			
		}
		
		// Retirando os valores repetidos
		for (int i = 0; i < seq.size(); i++) {
			for (int j = (seq.size() - 1); j != -1; j--) {
				if (seq.get(i) == seq.get(j) && (i != j)) {
					seq.remove(j);
					contaRep.remove(j);
				}
			}
		}
		
		// Impressão
		for (int i = 0; i < seq.size(); i++) {
			System.out.printf("%d ocorre %d vezes\n",seq.get(i),contaRep.get(i));
			
		}
	}
}
