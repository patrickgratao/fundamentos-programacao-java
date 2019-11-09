/*
 * 11) Escrever um programa em Java que contenha um vetor G(13) 
 * que é o gabarito de um teste de loteria esportiva, 
 * contendo os valores: A, B ou C para cada posição de G. 
 * Ler, a seguir, o número do cartão de um apostador e um vetor Resposta R (13). 
 * Verificar o número de acertos e escrever o número do apostador e seu número de acertos. 
 * Se tiver 13 acertos, acrescentar a mensagem: "GANHADOR, PARABENS".
 * 
 * */


package lista07;

import javax.swing.JOptionPane;

public class exercicio11 {
	public static void main(String[] args) {
		int tamanho = 13, acertos = 0;
		String[] gabarito = {"A", "B", "C", "A", "B", "C", "A", "B", "C", "A", "B", "C", "A" };
		
		int numeroApostador;
		String[] respostaApostador = new String [tamanho];
		
		
		numeroApostador = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do Apostador"));
		
		for (int i = 0; i < tamanho; i++ ) {
			respostaApostador[i] = JOptionPane.showInputDialog("Digite a opção que você marcou na posição "+(i+1));
		}
		
		for (int i  = 0; i < tamanho; i++) {
			if ( respostaApostador[i].equals(gabarito[i]) ) {
				acertos++;
			}
		}
		
		System.out.println("Apostador n° => "+numeroApostador+" Você acertou ==> "+acertos);
		if (acertos == tamanho) {
			System.out.println("GANHADOR, PARABENS");
		}
		
	}
}
