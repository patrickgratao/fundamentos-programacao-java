package lista10;

public class Exercicio05 {

	public static void main(String[] args) {
		System.out.println(celularValido("996880462"));
	}

	public static boolean celularValido(String numero) {
		if (numero.charAt(0) == '9') {
			if (numero.charAt(1) == '6' || numero.charAt(1) == '7' || numero.charAt(1) == '8' || numero.charAt(1) == '9'
					|| numero.substring(1, 3).equals("96") || numero.substring(1, 3).equals("97")
					|| numero.substring(1, 3).equals("98") || numero.substring(1, 3).equals("99")) {

				for (int i = 0; i < numero.length(); i++) {
					if (numero.charAt(i) == '0' || numero.charAt(i) == '1' || numero.charAt(i) == '2'
							|| numero.charAt(i) == '3' || numero.charAt(i) == '4' || numero.charAt(i) == '5'
							|| numero.charAt(i) == '6' || numero.charAt(i) == '7' || numero.charAt(i) == '8'
							|| numero.charAt(i) == '9') {
					} else {
						return false;

					}
				}
				if (numero.length() == 9) {
					return true;
				}

			}
		}
		return false;
	}
}
