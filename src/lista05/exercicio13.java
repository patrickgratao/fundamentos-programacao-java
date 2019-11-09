package lista05;

import javax.swing.JOptionPane;

public class exercicio13 {
	public static void main(String[] args) {
		String opcaoVoto;
		int numeroEleitores = 20;
		int votosA = 0, votosB = 0, votosC = 0;
		double quantidadeA, quantidadeB, quantidadeC;
		
		for (int contador = 0; contador < numeroEleitores; contador++) {
			opcaoVoto = JOptionPane.showInputDialog("Digite o voto ==> A | B | C");
					
			if (opcaoVoto.equals("A")) {
				votosA++;
			}
			else if (opcaoVoto.equals("B")) {
				votosB++;
			}
			else {
				votosC++;
			}
		}
		
		quantidadeA = 1.0 * votosA / numeroEleitores * 100.0;
		quantidadeB = 1.0 * votosB / numeroEleitores * 100.0;
		quantidadeC = 1.0 * votosC / numeroEleitores * 100.0;
		
		System.out.println("Votos de A ==> "+quantidadeA+" %");
		System.out.println("Votos de B ==> "+quantidadeB+" %");
		System.out.println("Votos de C ==> "+quantidadeC+" %");
	}
}
