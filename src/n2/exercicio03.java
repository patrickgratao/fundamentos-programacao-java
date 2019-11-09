package n2;

import javax.swing.JOptionPane;


public class exercicio03 {
	public static void main(String[] args) {
		int numeroVezes = Integer.parseInt(JOptionPane.showInputDialog("Numero de vezes que apertou o interruptor?"));
		int contador = 0, valorInterruptor;
		int lampadaA = 0, lampadaB = 0;
		
		while (contador < numeroVezes) {
			// I1, I2 => false
			// Aperta I1 entao Lampada A => true
			// Aperta I2 entao Lampada A => true, Lampada B => true;
			
			valorInterruptor = Integer.parseInt(JOptionPane.showInputDialog("Interruptor ==> 1 ou 2"));
			
			if (valorInterruptor ==  1) {
				if (lampadaA == 1) {
					lampadaA = 0;
				}
				else {
					lampadaA = 1;
				}
			}
				
			else if (valorInterruptor == 2) {
				if (lampadaA == 1 && lampadaB == 1) {
					lampadaA = 0;
					lampadaB = 0;
				}
				else if (lampadaA == 1 && lampadaB == 0) {
					lampadaA = 0;
					lampadaB = 1;
				}
				else if (lampadaA == 0 && lampadaB == 1) {
					lampadaA = 1;
					lampadaB = 0;
				}
				
				else {
					lampadaA = 1;
					lampadaB = 1;
				}
				
			}
			
			
			contador++;
		}
		
		System.out.println(lampadaA);
		System.out.println(lampadaB);
		
		
	}
}
