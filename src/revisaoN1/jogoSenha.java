package revisaoN1;

import javax.swing.JOptionPane;

public class jogoSenha {

	public static void main(String[] args) {
		int senha;
		int valorDigitado;
		
		//Valida��o da senha digitada - 0 a 100 s�o aceitos
		senha = -1;
		while (senha < 0 || senha > 100) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 1 - Digite uma senha de 0 a 100"));
			
		}
		//In�cio do jogo com o jogador 2
		
		for (int tentativas = 0; tentativas < 5; tentativas++) {
			valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("JOGADOR 2 - Digite um n�mero de 0 a 100"));
			
			if (valorDigitado == senha) {
				System.out.println("Parab�ns, voc� acertou a senha. ==> "+senha);
				break;
			}
			else {
				if (valorDigitado < senha) {
					System.out.println("O valor "+valorDigitado+" � menor que a senha.");
				}
				if (valorDigitado > senha) {
					System.out.println("O valor "+valorDigitado+" � maior que a senha.");
				}
				if ((senha == valorDigitado - 1) || (senha == valorDigitado + 1)) { 
					System.out.println("T� QUENTE!!!");
				}
					
				}
			
			if (tentativas == 4) {
				System.out.println("Voc� perdeu. Tente novamente!");
			}
			}
			
		
		}
		
		
		

	}
