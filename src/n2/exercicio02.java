package n2;

import javax.swing.JOptionPane;


public class exercicio02 {
	public static void main(String[] args) {
		int segredo = (int) (1+ Math.random() * 9);
		int contador = 1;

		//System.out.println(segredo);
		int entradaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 a 10:"));
		
		while (entradaUsuario != segredo) {
			System.out.println("Você errou, tente novamente!");
			entradaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 a 10:"));
			
			//Tentativas
			contador++;
		}
		System.out.println("Você acertou o segredo! ==> "+segredo);
		System.out.println("Quantidade de tentativas ==> "+contador);
		
	}
}
