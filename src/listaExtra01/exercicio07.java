package listaExtra01;

import javax.swing.JOptionPane;

public class exercicio07 {
	public static void main (String[] args) {
		String nomeFuncionario;
		double horasTrabalhadas, salarioBruto, descontos, salarioLiquido; 
		int dependentes;
		
		nomeFuncionario = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
		horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas por "+nomeFuncionario));
		dependentes = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes "+nomeFuncionario+" tem ?"));
		
		//Cálculos
		salarioBruto = (horasTrabalhadas * 12 ) + (dependentes * 40);
		descontos = (salarioBruto * 8.5/100.0) + (salarioBruto * 5.0/100.0);
		salarioLiquido = salarioBruto -  descontos;
		
		System.out.println(nomeFuncionario+" receberá Bruto R$ "+salarioBruto+" e Líquido: "+salarioLiquido);
	
	
	}

}
