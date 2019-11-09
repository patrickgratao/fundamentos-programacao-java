package lista03;

import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exercicio16 {
	public static void main (String args[]) {
		String dataNascimento;
		String [] dataNas, dataAtual;
		int diaNascimento, mesNascimento, anoNascimento;
		int diaAtual, mesAtual, anoAtual, qtdDiasVividos;
		
		dataNascimento = JOptionPane.showInputDialog("Insira a data de Nascimento ==> DD/MM/AAAA");
		
		dataNas = dataNascimento.split("/");
		diaNascimento = Integer.parseInt(dataNas[0]);
		mesNascimento = Integer.parseInt(dataNas[1]);
		anoNascimento = Integer.parseInt(dataNas[2]);
				
		//Fun��o para pegar a data atual
		Date date = new Date();
		//Formatar a data para o padr�o Brasileiro
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		dataAtual = (formato.format(date)).split("/");
		
		//dataAtual = ("10/09/2019").split("/");  //para teste debug
		
		diaAtual = Integer.parseInt(dataAtual[0]);
		mesAtual = Integer.parseInt(dataAtual[1]);
		anoAtual = Integer.parseInt(dataAtual[2]);
		
		qtdDiasVividos = (((anoAtual - anoNascimento) * 360) + ((mesAtual - mesNascimento)*30) + (diaAtual - diaNascimento)) +1;
		
		System.out.println(qtdDiasVividos);
		
	}
}
