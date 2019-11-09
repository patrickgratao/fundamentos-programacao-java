package listaExtra01;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		//Programa que lê a base e a altura de um triângulo e imprime a área
		
		//Declaração das variáveis que utilizaremos
		double base;
		double altura;
		double area;
		
		//Recebendo a base e convertendo para Double
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
		//Recebendo a altura e convertendo para Double
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
		
		//Cálculo do Área
		area = (base * altura) / 2; 
		
		//Impressão da área na tela do usuário
		System.out.println("O valor da área do triângulo é: "+area);
		
	}

}
