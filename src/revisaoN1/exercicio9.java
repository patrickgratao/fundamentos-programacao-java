package revisaoN1;

public class exercicio9 {
	public static void main (String args[]) {
		int dataInteira, dia, mes, ano;
		String novaData;
		
		dataInteira = 120858;
		dia = dataInteira / 10000;
		mes = dataInteira % 10000 / 100;
		ano = dataInteira % 100 / 1;
		
		if (mes <= 9) {
			novaData = ano + "0"+mes+""+dia;
		}
		
		else {
			novaData = ano + ""+mes+""+dia;
		}
						
		System.out.println(novaData);

	}
}
