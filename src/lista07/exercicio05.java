package lista07;

public class exercicio05 {
	public static void main(String[] args) {
		int tamanho = 15;
		int inicioIntervalo = 100, fimIntervalo = 1000, intervalo = fimIntervalo - inicioIntervalo;
		int[] vetor = new int[tamanho];
		int maior = -1, posicaoMaior = 0;
		int menor = 2000, posicaoMenor = 0;

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = inicioIntervalo + (int) (Math.random() * intervalo);

			if (vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
			
			else if (vetor[i] < menor) {
				menor = vetor[i];
				posicaoMenor = i;
			}
		}
		
		for (int numero : vetor) {
			System.out.print(numero+", ");
		}
	
	System.out.println("\n\nMaior número do Vetor => "+maior+" está na Posição ["+posicaoMaior+"]");
	System.out.println("Menor número do Vetor => "+menor+" está na Posição ["+posicaoMenor+"]");
	}
}
