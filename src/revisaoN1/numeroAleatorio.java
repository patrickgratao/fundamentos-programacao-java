package revisaoN1;

public class numeroAleatorio {
	public static void main (String args[]) {
		int inicioIntervalo, fimIntervalo, intervalo, numeroAleatorio;
		
		inicioIntervalo = 1;
		fimIntervalo = 384;
		intervalo = fimIntervalo - inicioIntervalo + 1;
		
		numeroAleatorio = inicioIntervalo + (int) (Math.random() * intervalo);
		System.out.println(numeroAleatorio);

	}
}
