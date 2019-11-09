package lista03;

public class exercicio10 {
	public static void main (String args[]) {
		double valor1, valor2;
		valor1 = 5.344;
		valor2 = 5.340;
		
		if (valor1 > valor2) {
			System.out.println("O maior �h: "+valor1);
		}
		
		else if (valor1 == valor2) {
			System.out.println("Os valores s�o iguais.");
		}
		
		else {
			System.out.println("O maior �h: "+valor2);
		}
	}
}
