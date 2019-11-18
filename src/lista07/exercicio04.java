package lista07;

public class exercicio04 {
	public static void main(String[] args) {
		int tamanho = 500;
		int inicioIntervalo = 1, fimIntervalo = 2000, intervalo = fimIntervalo - inicioIntervalo + 1;
		int[] vetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = inicioIntervalo + (int) (Math.random() * intervalo);
		}

		System.out.print("[");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vetor[i] + ", ");
		}
		System.out.println("]");
	}
}
