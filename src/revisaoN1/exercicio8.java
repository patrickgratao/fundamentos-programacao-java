package revisaoN1;

public class exercicio8 {
	public static void main (String args[]) {
		String dia, mes, ano, perfil;
		int resultadoData, operacao1, operacao2, calculo, numeroPerfil;
		
		dia = "23";
		mes = "03";
		ano = "1994";
		
		resultadoData = Integer.parseInt((dia+mes)) + Integer.parseInt(ano);
		
		operacao1 = resultadoData / 100;
		operacao2 = resultadoData % 100;
		
		calculo = operacao1 + operacao2;
		
		numeroPerfil = calculo % 5;
		
		System.out.println(numeroPerfil);
		
		//Verificações
		if (numeroPerfil == 0) {
			perfil = "Tímido";
		}
		else if (numeroPerfil == 1) {
			perfil = "Sonhador";
		}
		
		else if (numeroPerfil == 2) {
			perfil = "Paquerador";
		}
		
		else if (numeroPerfil == 3) {
			perfil = "Atraente";
		}
		
		else {
			perfil = "Irresistível";
		}
		
		System.out.println(perfil);
		}
		
		
	}

