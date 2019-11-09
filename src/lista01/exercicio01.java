package lista01;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double soma;
		double subtracao;
		double multiplicacao;
		double divisao;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
		
		//Operações
		soma = num1+num2;
		subtracao = num1-num2;
		multiplicacao = num1*num2;
		divisao = num1/num2;
		
		//Impressões na tela
		System.out.println("A soma é: "+soma);
		System.out.println("A subtração é: "+subtracao);
		System.out.println("A multiplicação é: "+multiplicacao);
		System.out.println("A divisao é: "+divisao);
		

	}

}
