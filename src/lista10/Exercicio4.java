package lista10;

import java.util.Arrays;

public class Exercicio4 {

	public static void main(String[] args) {
		String[] emails = { "luiza@gmail.com", "anderson@yahoo.com.br", "patryck@patryck.com", "luzia@hotmail.com" };
		System.out.println("E-mails: "+Arrays.toString(emails)+"\n");
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				System.out.println("Gmail ==> "+listaEmails(emails)[i]);
				break;
			case 1:
				System.out.println("Hotmail ==> "+listaEmails(emails)[i]);
				break;
			case 2:
				System.out.println("Yahoo ==> "+listaEmails(emails)[i]);
				break;
			case 3:
				System.out.println("Outros Serviços ==> "+listaEmails(emails)[i]);
				break;
			default:
				break;
			}

		}
	}

	public static int[] listaEmails(String[] emails) {
		int contadorY = 0, contadorG = 0, contadorH = 0, contadorD = 0;
		
		for (int i = 0; i < emails.length; i++) {
			String email = emails[i];
			if (email.matches("(.*)yahoo(.*)")) {
				contadorY++;
			} else if (email.matches("(.*)hotmail(.*)")) {
				contadorH++;
			} else if (email.matches("(.*)gmail(.*)")) {
				contadorG++;
			} else {
				contadorD++;
			}
		}

		int quantidades[] = { contadorG, contadorH, contadorY, contadorD };
		return quantidades;
	}

}