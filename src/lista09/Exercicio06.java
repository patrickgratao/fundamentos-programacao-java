package lista09;

public class Exercicio06 {
	
	public static void main(String[] args) {
		System.out.println(isCompra(801, 1200, 400));
	}
	
	public static int isCompra (int qAtual, int qMaxima, int qMinima) {
		double quantidadeMedia = (qMaxima + qMinima)/ 2.0;
		
		if (qAtual >= quantidadeMedia) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
