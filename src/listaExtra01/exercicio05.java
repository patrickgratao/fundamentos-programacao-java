package listaExtra01;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {
		int numero, milhar, centena, dezena, unidade;
		double calculo, milharDouble, centenaDouble, dezenaDouble, unidadeDouble;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 4 algarismos: "));
		
		//Descobrindo as unidades
		milhar = numero / 1000;
		centena = numero % 1000 / 100;
		dezena = numero % 100 / 10;
		unidade = numero % 10 / 1;
		
		System.out.println("Número: "+numero+" Milhar: "+milhar+" Centena: "+centena+" Dezena: "+dezena+" Unidade: "+unidade);
		
		//Convertendo as unidades para Double
		milharDouble = milhar;
		centenaDouble = centena;
		dezenaDouble = dezena;
		unidadeDouble = unidade;
		
		//Realizando o Double
		calculo = (milharDouble * unidadeDouble) / (centenaDouble * dezenaDouble);
		
		//Impressão do resultado na tela
		System.out.println(milharDouble+" * "+unidadeDouble+" / "+centenaDouble+" * "+dezenaDouble+" = "+calculo);
		
	}

}
