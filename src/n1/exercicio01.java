package n1;

public class exercicio01 {
	public static void main (String args[]) {
		int inicioIntervalo, fimIntervalo, intervalo, primeiroAleatorio, segundoAleatorio;
		int milharPrimeiro, centenaPrimeiro, dezenaPrimeiro, unidadePrimeiro;
		int milharSegundo, centenaSegundo, dezenaSegundo, unidadeSegundo, terceiroNumero;
		
		inicioIntervalo = 1000;
		fimIntervalo = 9999;
		intervalo = fimIntervalo - inicioIntervalo + 1;

		primeiroAleatorio = inicioIntervalo + (int) (Math.random() * intervalo);
		segundoAleatorio = inicioIntervalo + (int) (Math.random() * intervalo);
		
		
		milharPrimeiro = primeiroAleatorio / 1000;
		centenaPrimeiro =  primeiroAleatorio % 1000 / 100;
		dezenaPrimeiro = primeiroAleatorio % 100 / 10;
		unidadePrimeiro = primeiroAleatorio % 10 / 1;
		
		milharSegundo = segundoAleatorio / 1000;
		centenaSegundo =  segundoAleatorio % 1000 / 100;
		dezenaSegundo = segundoAleatorio % 100 / 10;
		unidadeSegundo = segundoAleatorio % 10 / 1;

		terceiroNumero = Integer.parseInt((milharPrimeiro+""+milharSegundo+""+centenaPrimeiro+""+""+centenaSegundo+""+dezenaPrimeiro+""+""+dezenaSegundo+""+unidadePrimeiro+""+unidadeSegundo));

		System.out.println(primeiroAleatorio);
		System.out.println(segundoAleatorio);
		System.out.println(terceiroNumero);
	}

}
