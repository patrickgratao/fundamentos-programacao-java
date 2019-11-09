package lista03;

public class exercicio13 {
	public static void main (String args[]) {
		double valor1, valor2, valor3;
		
		valor1 = 2;
		valor2 = 9;
		valor3 = 7;
		
		if (valor1 > valor2 && valor1 > valor3) {
			
			if (valor2 > valor3) {
				System.out.print(valor3+" / "+valor2);
			}
			
			else {
				System.out.print(valor2+" / "+valor3);
			}
			System.out.print(" / "+valor1);
		}
		
		else if (valor2 > valor1 && valor2 > valor3) {
			
			if (valor1 > valor3) {
				System.out.print(valor3+" / "+valor1);
			}
			
			else {
				System.out.print(valor1+" / "+valor3);
			}
			
			System.out.print(" / "+valor2);
			
		}
		
		else if (valor3 > valor1 && valor3 > valor2) {
			
			if (valor1 > valor2) {
				System.out.print(valor2+" / "+valor1);
			}
			
			else {
				System.out.print(valor1+" / "+valor2);
			}
			System.out.print(" / "+valor3);
			
		}
	}
}
