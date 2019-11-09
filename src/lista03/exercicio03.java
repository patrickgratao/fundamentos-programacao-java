package lista03;

public class exercicio03 {

	public static void main(String[] args) {
		int erros;
		
		erros = 0;
		
		if (erros == 1 || erros == 0) {
			System.out.println(erros+" erro detectado");
		}
		
		else if (erros < 0) {
			System.out.println("Erro no sistema!");
		}
		
		else {
			System.out.println(erros+ " erros detectados");
		}

	}

}
