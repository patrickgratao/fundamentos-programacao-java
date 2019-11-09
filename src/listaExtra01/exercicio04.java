/* O programa receberá um número de 3 algarismos e executará um cálculo
 *  Desafio: separar os números em Milhar, Centena, Dezena, Unidade
 * */

package listaExtra01;

import javax.swing.JOptionPane;

public class exercicio04 {
	public static void main (String[] args) {
		
		//Declaração das variáveis 
		int numero;
		int centena;
		int dezena;
		int unidade;
		int calculo;
		
		//Recebimento do número
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 3 algarismos: "));
		
		//Cálculos com o resto para descobrir as unidades
		centena = numero / 100;
		dezena = numero % 100 / 10;
		unidade = numero % 10 / 1;
		
		System.out.println("Número: "+numero+" Centena: "+centena+" Dezena: "+dezena+" Unidade: "+unidade);
		
		//Resolvendo o cálculo pedido
		calculo =  (centena * 5) + (dezena * 3) + unidade; 
		
		//Imprimindo na tela o resultado do cálculo
		System.out.println("Resultado de "+centena+" * 5 + "+dezena+" * 3 + "+unidade+" = "+calculo);
		
	}
}
