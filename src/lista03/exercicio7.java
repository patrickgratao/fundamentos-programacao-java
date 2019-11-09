package lista03;

public class exercicio7 {

	public static void main (String args[]) {
		double altura, pesoIdeal;
		String sexo;
		
		altura = 1.98;
		sexo = "Feminino";
		
		if (sexo == "Masculino") {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("O seu peso ideal �h: "+pesoIdeal);
		}
		
		else if (sexo == "Feminino") {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("O seu peso ideal �h: "+pesoIdeal);
		}
		
		else {
			System.out.println("Erro ao digitar o sexo!");
		}
	}
}
