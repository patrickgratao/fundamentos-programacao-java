package lista09;

public class Exercicio04 {
	public static void main(String[] args) {
		imprimirData(5, 3, 1985);
	}

	public static void imprimirData(int dia, int mes, int ano) {
		String mesExtenso = "Null";
		switch (mes) {
		case 1:
			mesExtenso = "Janeiro";
			break;
		case 2:
			mesExtenso = "Fevereiro";
			break;
		case 3:
			mesExtenso = "Março";
			break;
		case 4:
			mesExtenso = "Abril";
			break;
		case 5:
			mesExtenso = "Maio";
			break;
		case 6:
			mesExtenso = "Junho";
			break;
		case 7:
			mesExtenso = "Julho";
			break;
		case 8:
			mesExtenso = "Agosto";
			break;
		case 9:
			mesExtenso = "Setembro";
			break;
		case 10:
			mesExtenso = "Outubro";
			break;
		case 11:
			mesExtenso = "Novembro";
			break;
		case 12:
			mesExtenso = "Dezembro";
			break;

		}
		System.out.printf("%d de %s de %d\n",dia,mesExtenso,ano);
	}
}
