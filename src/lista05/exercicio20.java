package lista05;

public class exercicio20 {
	public static void main(String[] args) {
		double resultado = 1;
		double dividendo = 3, divisor = 2;
		
		while (dividendo < 100) {
			
			if (divisor % 2 == 0) {
				resultado -= (dividendo/divisor);
			}
			else {
				resultado += (dividendo/divisor);
			}
			
			
			dividendo += 2;
			divisor++;
		}
		
		System.out.println(resultado);
		
		                                                                    
		
		
	}
}
