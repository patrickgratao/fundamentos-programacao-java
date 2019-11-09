package listaExtra01;

import javax.swing.JOptionPane;

public class exercicio06 {
	public static void main (String[] args) {
		double precoFabrica, precoImpostos, percRevendedor, precoFinal;
		
		precoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de fábrica do carro: "));
		
		//Calculo
		precoImpostos = precoFabrica * 45.0/100.0;
		percRevendedor = 28.0/100.0 * precoFabrica;
		precoFinal = precoFabrica + precoImpostos + percRevendedor;
		
		System.out.println("Valor final do carro: R$ "+precoFinal);
		
	}
}
