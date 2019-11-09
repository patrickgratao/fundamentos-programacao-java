package lista04;

import javax.swing.JOptionPane;

public class exercicio10 {
	public static void main (String args[]) {
		String destino;
		double valorPassagem;
		int decisaoRetorno;
		
		destino = JOptionPane.showInputDialog("Informe o destino");
		
		decisaoRetorno = JOptionPane.showConfirmDialog(null, "Você quer Ida e Volta?", "Retorno da Viagem", JOptionPane.YES_NO_OPTION);
		
		System.out.println(destino);
		if (decisaoRetorno == JOptionPane.NO_OPTION) {
			if (destino == "Região Norte" || destino == "Norte") {
				System.out.println("entrei");
				valorPassagem = 500.0;
			}
			else if (destino == "Região Nordeste" || destino == "Nordeste") {
				valorPassagem = 350.0;
			}
			else if (destino == "Região Centro-Oeste" || destino == "Região Centro Oeste" || destino == "Centro Oeste" || destino == "Centro-Oeste") {
				valorPassagem = 350;
			} 
			else if (destino == "Sul" || destino == "Região Sul") {
				valorPassagem = 300;
			}
			else {
				valorPassagem = 0.0;
			}
			
		}
		
		else {
			if (destino == "Região Norte" || destino == "Norte") {
				valorPassagem = 900;
			}
			else if (destino == "Região Nordeste" || destino == "Nordeste") {
				valorPassagem = 650;
			}
			else if (destino == "Região Centro-Oeste" || destino == "Região Centro Oeste" || destino == "Centro Oeste" || destino == "Centro-Oeste") {
				valorPassagem = 600;
			} 
			else if (destino == "Sul" || destino == "Região Sul") {
				valorPassagem = 550;
			}
			else {
				valorPassagem = 0.0;
			}
		}
		
		System.out.println(valorPassagem);
			
	       
		
	}
}
