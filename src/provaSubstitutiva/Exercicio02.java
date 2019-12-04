package provaSubstitutiva;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio02 {

	// Método para gerar número Aleatório
	public static int gerarAleatorio(int inicioIntervalo, int fimIntervalo) {
		int aleatorio = inicioIntervalo + (int) (Math.random() * (fimIntervalo - inicioIntervalo + 1));
		return aleatorio;
	}

	public static void main(String[] args) {

		int tamanho = 20, inicioIntervalo = 1, fimIntervalo = 30;
		int auxiliar;
		ArrayList<Integer> vetorR = new ArrayList<Integer>();
		ArrayList<Integer> vetorS = new ArrayList<Integer>();

		// Preenchimento do Vetor R
		for (int i = 0; i < tamanho; i++) {
			vetorR.add(gerarAleatorio(inicioIntervalo, fimIntervalo));
		}

		// Ordenação do Vetor R
		for (int i = 0; i < vetorR.size(); i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (vetorR.get(j) > vetorR.get(j + 1)) {
					auxiliar = vetorR.get(j);
					vetorR.set(j, vetorR.get(j + 1));
					vetorR.set(j + 1, auxiliar);
				}
			}
		}
	
		System.out.println(vetorR);
		//
		for (int i = 0; i < vetorR.size(); i++) {
			for (int j = 0; j < vetorR.size() - 1; j++) {
				if (vetorR.get(j) != vetorR.get(j + 1)) {
					vetorS.add(vetorR.get(j+1));
				}
			}

		}

		System.out.println(vetorS);

	}
}