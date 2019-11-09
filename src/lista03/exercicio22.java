package lista03;

import javax.swing.JOptionPane;

public class exercicio22 {
	public static void main (String args[]) {
		
		int nota;
		String conceito;
		
		nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno"));
		
		if (nota >= 0 && nota <= 49) {
			conceito = "Insuficiente";
		}
		
		else if (nota >= 50 && nota <= 64) {
			conceito = "Regular";
		}
		
		else if (nota >= 65 && nota <= 84) {
			conceito = "Bom";
		}
		
		else {
			conceito = "�timo";
		}
		
		System.out.println(conceito);
		
		
	}

}
