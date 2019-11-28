package lista09;

public class Exercicio07 {
	public static void main(String[] args) {
		for(int valor : tabuada(20)) {
			System.out.println(valor);
		}
	}
	
	public static int[] tabuada(int n) {
		int limite = 10;
		int [] multiplicacao = new int [limite];
		
		for (int i = 0; i < multiplicacao.length; i++) {
			multiplicacao[i] = n * (i+1);
		}
		return multiplicacao;
	}
}
