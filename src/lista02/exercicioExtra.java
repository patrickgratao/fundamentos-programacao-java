package lista02;

public class exercicioExtra {
	public static void main (String args[]) {
		int numeroAleatorio;
		int inicioIntervalo, fimIntervalo;
		
		inicioIntervalo = 12;
		fimIntervalo = 500;
		int intervalo = fimIntervalo - inicioIntervalo;
		
		numeroAleatorio = inicioIntervalo + (int) (Math.random() * (intervalo + 1));
		System.out.println(numeroAleatorio);
	}
}