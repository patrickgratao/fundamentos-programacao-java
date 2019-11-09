package n1;

import javax.swing.JOptionPane;

public class exercicio03 {
	public static void main (String args[]) {
		double variancia, quantidadeAmostras, mediaElementos;
		double numero1, numero2, numero3, numero4, somatoria;
		
		quantidadeAmostras = 4;

		numero1 = Double.parseDouble((JOptionPane.showInputDialog("Digite o numero 1")));
		numero2 = Double.parseDouble((JOptionPane.showInputDialog("Digite o numero 2")));
		numero3 = Double.parseDouble((JOptionPane.showInputDialog("Digite o numero 3")));
		numero4 = Double.parseDouble((JOptionPane.showInputDialog("Digite o numero 4")));

		mediaElementos = (numero1 + numero2 + numero3 + numero4) / quantidadeAmostras;
		
		somatoria = Math.pow((numero1 - mediaElementos),2) + Math.pow((numero2 - mediaElementos),2) +
				Math.pow((numero3 - mediaElementos),2) + Math.pow((numero4 - mediaElementos),2);
		
		
		variancia = (1 / (quantidadeAmostras - 1)) * somatoria;
		
		//System.out.println(mediaElementos);
		//System.out.println(somatoria);
		System.out.println(variancia);
		
	
	}
}

