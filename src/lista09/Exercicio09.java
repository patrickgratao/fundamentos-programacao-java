package lista09;

import javax.swing.JOptionPane;

public class Exercicio09 {
	
	public static void main(String[] args) {
		char[] sexos = new char[3];
		
		for (int i = 0; i < sexos.length; i++) {
			sexos[i] = JOptionPane.showInputDialog("Digite o Sexo "+(i+1)).charAt(0);
		}
		
		for (double valor : pSexo(sexos)) {
			System.out.println(valor);
		}
	}
	
	
	public static double[] pSexo (char[] sexo) {
		double percMasc = 0, percFem = 0;
		double [] quantidades = new double [2];
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 'F' || sexo[i] == 'f') {
				percMasc++;
			}
			else {
				percFem++;
			}
		}
		
		percMasc = (percMasc / sexo.length)* 100;
		percFem = (percFem / sexo.length)* 100;
		
		for (int i = 0; i < quantidades.length; i++) {
			if (i == 0) {
				quantidades[i] = percMasc;
			}
			else  {
				quantidades[i] = percFem;
			}
		}
		return quantidades;
	}
}
