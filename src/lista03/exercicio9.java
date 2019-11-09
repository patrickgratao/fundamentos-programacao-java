package lista03;

import javax.swing.JOptionPane;


public class exercicio9 {
	public static void main(String[] args) {
		int data, dia, mes, ano;
		data = Integer.parseInt(JOptionPane.showInputDialog("Informe a data: DDMMAA"));
		
		dia = data / 10000;
		mes = (data % 10000) / 100;
		ano = (data % 10000) % 100;
		
		if (mes > 1 && mes < 10) {
			System.out.println(""+ano+"0"+mes+""+dia);
		}
		
		else {
			System.out.println(""+ano+""+mes+""+dia);
		}
		
		System.out.println("Dia "+dia+" mes "+mes+" ano "+ano);
		
	}

}
