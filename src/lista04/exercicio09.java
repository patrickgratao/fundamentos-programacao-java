package lista04;

import javax.swing.JOptionPane;

public class exercicio09 {
	public static void main (String args []) {
		int numero;
		String dia;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 1 a 7"));
		
		switch (numero) {
		case 1:
			dia = "Domingo";
			break;
		case 2: 
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5: 
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Opção Inválida";
			break;
		}
		
		System.out.println(dia);
	}
}
