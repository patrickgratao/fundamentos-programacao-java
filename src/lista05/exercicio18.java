package lista05;

public class exercicio18 {
	public static void main(String[] args) {
		
		/*Tabuada dos divis�veis por 2*/
	
		int limite = 10, contador = 0, limiteOriginal = limite;
		int vetor[] = new int[limite];
		
		
		while (limite > 0) {
			
			if (limite % 2 == 0 && limite != 0.0) {
				vetor[contador] = limite;
				contador++;
			}
			limite--;
		}

		System.out.println("contador: "+contador);

		for (int i = 0; contador > 0; i++) {
			System.out.println("\n====== TABUADA DE "+vetor[i]+" ======\n");
			
			//Tabuada Adi��o
			System.out.println("Adi��o");
			for( int j = 0; j <= limiteOriginal; j++) {
				System.out.println(j+" + "+vetor[i]+" ==> "+j+vetor[i]);
			}
			
			//Tabuada Subtracao
			System.out.println("\nSubtra��o");
			for( int j = 0; j <= limiteOriginal; j++) {
				System.out.println(j+" - "+vetor[i]+" ==> "+(j-vetor[i]));
			}
			
			//Tabuada Multiplica��o
			System.out.println("\nMultiplica��o");
			for( int j = 0; j <= limiteOriginal; j++) {
				System.out.println(j+" * "+vetor[i]+" ==> "+j*vetor[i]);
			}
			
			//Tabuada Divis�o
			System.out.println("\nDivis�o");
			for( int j = 0; j <= limiteOriginal; j++) {
				System.out.println(j+" / "+vetor[i]+" ==> "+j/vetor[i]);
			}
			
			contador--;
	
		}
	
	}
}
