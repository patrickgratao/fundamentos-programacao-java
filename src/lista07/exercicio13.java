package lista07;

/*
 * 	Dado um conjunto de 100 valores num�ricos dispon�veis num meio de entrada
	qualquer, fazer um programa em Java para armazen�-los em um vetor, e calcular e
	imprimir o valor do somat�rio dado a seguir
*/
public class exercicio13 {

	static double numeroAleatorio(double inicioIntervalo, double intervalo) {
		double random = inicioIntervalo + (Math.random() * intervalo);
		return random;

	}

	public static void main(String[] args) {
		int tamanho = 100;
		int inicioIntervalo = 1, fimIntervalo = 200, intervalo = fimIntervalo - inicioIntervalo;
		double [] vetor = new double[tamanho];
		double somatorio = 0;
		
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = numeroAleatorio(inicioIntervalo, intervalo);
		}
		
		for (int i = 0, j = (tamanho-1); i < tamanho; i++, j--) {
			//System.out.println(vetor[i] - vetor[j]);
			somatorio += Math.pow((vetor[i] - vetor[j]), 3);
		}
		
		System.out.println("Somatorio ==> "+somatorio);
	}

}
