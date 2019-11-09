package lista05;

public class exercicio06 {
	public static void main(String[] args) {
		int numeros = 100;
		int limite = 200;
		int soma = 0;
		
		while (numeros <= limite) {
			System.out.println(numeros);
			soma += numeros;
			numeros++;
			
		}
		
		System.out.println(soma);
		
	}

}
