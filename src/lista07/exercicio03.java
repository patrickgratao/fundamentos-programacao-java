package lista07;

public class exercicio03 {
	public static void main(String[] args) {
		int tamanho = 80, contador = 0;
		int[] vetor = new int[tamanho];
		
		//Preenchimento do Vetor
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = (1+ (int) (Math.random() * 200));
		}
		
		for (int numero : vetor) {
			if (numero > 100) {
				contador++;
			}
			System.out.println(numero);
			
		}
		System.out.println("Qtd de Números > 100 => "+contador);
	}
}
