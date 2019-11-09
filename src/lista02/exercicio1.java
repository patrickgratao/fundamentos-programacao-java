package lista02;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		double catetoOposto, catetoAdjacente, hipotenusa, seno, cosseno, tangente;
		
		catetoOposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto oposto: "));
		catetoAdjacente = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto adjacente"));
		hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2));
		
		seno = catetoOposto/hipotenusa;
		cosseno = catetoAdjacente/hipotenusa;
		tangente = catetoOposto/catetoAdjacente;
		
		//Imprimindo na tela
		System.out.println("O seno é: "+seno);
		System.out.println("O cosseno é: "+cosseno);
		System.out.println("A tang3ente é: "+tangente);
	}

}
