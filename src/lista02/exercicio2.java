package lista02;

public class exercicio2 {

	public static void main(String[] args) {
		int numeroAleatorio, inicioIntervalo, fimIntervalo, intervalo;
		int milhar, centena, dezena, unidade;
		double valorFinal;
		
		inicioIntervalo = 1000;
		fimIntervalo = 9999;
		intervalo = fimIntervalo  - inicioIntervalo + 1;
		
		numeroAleatorio = inicioIntervalo + (int) (Math.random() * intervalo);

		milhar = numeroAleatorio / 1000;
		centena = numeroAleatorio % 1000 / 100;
		dezena = numeroAleatorio % 100 / 10;
		unidade = numeroAleatorio % 10 / 1;
		
		//  random(M*10) => (Math.random() * (milhar * 10))
		valorFinal = (unidade + (Math.random() * (milhar * 10))) / (Math.sqrt(centena) + Math.pow(2, dezena)); 
		
		System.out.println("Numero Aleatorio: "+numeroAleatorio);
		System.out.println("Milhar: "+milhar+" Centena: "+centena+" Dezena: "+dezena+" Unidade: "+unidade);
		System.out.println("Resultado: "+valorFinal);
		
		
	}

}