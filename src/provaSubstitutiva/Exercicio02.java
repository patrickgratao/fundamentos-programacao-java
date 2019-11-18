/*Faça um programa em Java que preencha um vetor de 500 posições 
 * com números aleatórios variando entre 1 e 20000. 
 * Imprima o vetor gerado. U
 * se o método Math.random() para gerar um número aleatório. 
 * */

package provaSubstitutiva;

public class Exercicio02 {

	public static double numeroAleatorio(double inicioIntervalo, double fimIntervalo) {
		double intervalo = fimIntervalo - inicioIntervalo + 1;
		double random = inicioIntervalo + (Math.random() * intervalo);
		return random;
	}

	public static void main(String[] args) {
		int tamanho = 5000;
		double[] vetor = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = numeroAleatorio(1, 20000);
		}

		System.out.print("[");
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("%.2f, ",vetor[i]);
		}
		System.out.println("]");
	}

}
