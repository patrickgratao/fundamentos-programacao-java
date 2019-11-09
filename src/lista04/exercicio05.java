package lista04;

import javax.swing.JOptionPane;

public class exercicio05 {
	public static void main (String args[]) {
		double salarioBruto, valorEmprestimo, limite;

		salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário Bruto"));
		valorEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de empréstimo"));
		
		limite = (salarioBruto * 30)/100;

		if (valorEmprestimo > limite) {
			System.out.println("O empréstimo foi recusado!");
		}
		
		else {
			System.out.println("O empréstimo foi aprovado!");
		}
	}
}
