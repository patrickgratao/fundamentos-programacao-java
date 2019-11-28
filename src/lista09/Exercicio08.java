package lista09;

public class Exercicio08 {
	public static int [][] tabuadaG () {
		int [][] tabuada = new int [10][10];
		
		for (int i  = 0; i < tabuada.length; i++) {
			for(int j = 0; j < tabuada[0].length; j++) {
				tabuada[i][j] = (i+1) * (j+1);
			}
		}
	return tabuada;
	}
	
	public static void main (String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Tabuada de "+(i+1)+" ==> ");
			for (int j = 0; j < 10; j++) {
				System.out.printf(" %d ",tabuadaG()[i][j]);
			}
			System.out.println();
		}
	}
}
