package lista05;

public class exercicio04 {
	public static void main(String[] args) {
		/*
		 *  Fa�a um programa que exiba uma tabela de convers�o de polegadas em
cent�metros, variando as polegadas de 0 a 10 de meio em meio. (Considere: 1� ~ 2.54
cm)*/
		
		double polegadas = 0;
		double polToCent = 2.54;
		
		if (polegadas == 0) {
			System.out.println(polegadas+"� = "+polToCent*polegadas+" cent�metros");
			polegadas++;
		}
		
		for (; polegadas <= 10; polegadas += 0.5) {
			System.out.println(polegadas+"� = "+polToCent*polegadas+" cent�metros");
		}
	}

}
