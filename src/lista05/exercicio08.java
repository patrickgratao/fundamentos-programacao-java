package lista05;

import javax.swing.JOptionPane;

public class exercicio08 {

	public static void main(String[] args) {
		int idade;
		String sexo;
		int contador = 0;
		
		while (contador < 10) {
			 idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "+contador));
			 sexo = JOptionPane.showInputDialog("Seu sexo");
			 
			//String.equals("Texto de comparação") --> true or false --> parece o ==
			 if (idade > 21 && sexo.equals("Masculino")) {
				 System.out.println("OK");
			 }
			 else {
				 System.out.println("Nao entrei "+idade);
			 }
			 
			 contador++;
		}
	}

}
