package lista03;

public class exercicio05 {

	public static void main(String[] args) {
		int lado1, lado2, lado3;
		
		lado1 = 1;
		lado2= 4;
		lado3 = 9; //N�o � um triangulo
		
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
			System.out.println("� um tri�ngulo!");
			
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("O tri�ngulo � equil�tero.");
			}
			
			else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("O tri�ngulo � escaleno.");
			}
			
			else {
				System.out.println("O tri�ngulo � is�celes.");
			}
			
		}
		
		else {
			System.out.println("N�o � um tri�ngulo!");
		}
	}

}
