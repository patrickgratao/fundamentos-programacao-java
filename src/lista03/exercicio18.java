package lista03;

import javax.swing.JOptionPane;

public class exercicio18 {
	public static void main (String args[]) {
		int valorTotal, valorPago, troco;
		int notaUm, notaDez, notaCem, divisor;
		valorTotal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total da compra"));
		valorPago = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor pago "));
		
		troco = valorPago - valorTotal;
		
		String contadorStr = Integer.toString(troco);
		int contador = contadorStr.length();
		
		System.out.println(contador);
		if (contador <= 1) {
			divisor = (int) (Math.pow(10, contador));
		}
		
		else {
			divisor = (int) (Math.pow(10, contador-1));
		}
		
		notaCem = troco / divisor;
		notaDez = troco % divisor / 10;
		notaUm = troco % divisor % 10;
		
		System.out.println("Valor da Compra ==> R$ "+valorTotal);
		System.out.println("Troco ==> R$ "+troco);
		
		System.out.println("Notas de Cem ==> "+notaCem+"\nNotas de Dez ==> "+notaDez+"\nNotas de Um ==> "+notaUm);
		
		
		
	}
}
