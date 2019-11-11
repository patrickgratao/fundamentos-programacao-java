import javax.swing.JOptionPane;

/*
 * 2. Desenvolva um programa que leia duas matrizes (2 x 3 e 3 x 2) do tipo inteiro.
 Efetue a multiplicação da matriz e apresente a matriz resultante. 
 * 
 * */
public class exercicio02 {
	public static void main(String[] args) {
		int somatorio;
		int[][] matrizA = new int[2][3];
		int[][] matrizB = new int[3][2];
		int[][] matrizC = new int[2][2];

		// Preenchimento Matriz A
		System.out.println("Matriz A");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				matrizA[i][j] = Integer.parseInt(JOptionPane
						.showInputDialog("Valor ["+i+","+j+"]"));
			}
		}

		// Preenchimento Matriz B
		System.out.println("Matriz B");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matrizB[i][j] = Integer.parseInt(JOptionPane
						.showInputDialog("Valor ["+i+","+j+"]"));
			}
		}
		// Lógica do Programa
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				somatorio = 0;
				for (int k = 0; k < 2; k++) {
					somatorio = somatorio + (matrizA[i][k] * matrizB[k][j]);
				}
				matrizC[i][j] = somatorio;
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizC[i][j]+", ");
			}
			System.out.println();
		}

	}

}
