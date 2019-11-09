/* Programa que recebe o valor de uma conta, a quantidade de consumidores
 * E calcula quanto cada um deve pagar
 * */

package listaExtra01;

import javax.swing.JOptionPane;

public class exercicio03 {
	//Classe principal onde devo colocar o meu código
	public static void main (String[] args) {
		//Declaração das variáveis
		double valorDaConta;
		int quantidadeConsumidores;
		double contaDividida;
		
		valorDaConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta: "));
		quantidadeConsumidores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de consumidores: "));
		
		//Calculo da conta dividida
		contaDividida = valorDaConta / quantidadeConsumidores;
		
		//impressao na tela
		System.out.println("Cada consumidor deve pagar: R$ "+contaDividida);
	
	}
	

}
