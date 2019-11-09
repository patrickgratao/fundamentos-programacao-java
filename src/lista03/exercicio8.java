package lista03;

import javax.swing.JOptionPane;


public class exercicio8 {
	public static void main(String[] args) {
		String dataNascimento;
		
		dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: dd/mm/aaaa");
		
		String [] data = dataNascimento.split("/");
		String dia = data[0];
		String mes = data[1];
		int ano = Integer.parseInt(data[2]);
		
		int diaMes = Integer.parseInt(dia+mes);
		
		int calculo = diaMes+ano;
		
		int parte1 = calculo / 100;
		int parte2 = calculo % 100;
		
		calculo = parte1+parte2;
		calculo = calculo % 5;
		
		switch (calculo) {
		case 0:
			System.out.println("T�mido");
			break;
		case 1: 
			System.out.println("Shonhador");
			break;
		case 2:
			System.out.println("Paquerador");
			break;
		case 3: 
			System.out.println("Atraente");
			break;
		case 4:
			System.out.println("Irresist�vel");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
	}

}
