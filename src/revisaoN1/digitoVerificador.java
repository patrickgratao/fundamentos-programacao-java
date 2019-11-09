package revisaoN1;

public class digitoVerificador {
	public static void main (String args[]) {
		int numeroAleatorio, inicioIntervalo, fimIntervalo, intervalo;
		int a, b, c, d, e, soma, digitoVerificador;
		
		inicioIntervalo = 10000;
		fimIntervalo = 99999;
		intervalo = fimIntervalo - inicioIntervalo + 1;
		
		numeroAleatorio = inicioIntervalo + (int) (Math.random() * intervalo);
		
		//ABCDE
		a = numeroAleatorio / 10000;
		b = numeroAleatorio % 10000 / 1000;
		c = numeroAleatorio % 1000 / 100;
		d = numeroAleatorio % 100 / 10;
		e = numeroAleatorio % 10 / 1;

		soma =  6*a + 5*b + 4*c + 3*d + 2*e;
		
		digitoVerificador = soma % 7;
		
		System.out.println(digitoVerificador);
	}

}
