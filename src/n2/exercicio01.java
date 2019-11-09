package n2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class exercicio01 {
	public static void main(String[] args) {

		int contadorProteina = 0, contadorCarboidrato = 0, contadorGordura = 0;
		double caloriasProteina = 0.0, caloriasCarboidrato = 0.0, caloriasGordura = 0.0;

		ArrayList<String> nomeAlimento = new ArrayList<String>();
		ArrayList<String> categoriaAlimento = new ArrayList<String>();
		ArrayList<String> carboidratos = new ArrayList<String>();
		ArrayList<String> gorduras = new ArrayList<String>();
		ArrayList<String> proteinas = new ArrayList<String>();
		ArrayList<Double> valorCalorico = new ArrayList<Double>();
		String maiorCalorias = "nenhum";

		valorCalorico.add(-1.0);

		// Preenchendo informa��es
		for (int i = 0; (i == 0 ? valorCalorico.get(i) : valorCalorico.get(i - 1)) != 0; i++) {
			if (valorCalorico.get(0) == -1.0) {
				valorCalorico.remove(0);
			}
			nomeAlimento.add(JOptionPane.showInputDialog("Digite o alimento " + (i + 1)));
			categoriaAlimento
					.add(JOptionPane.showInputDialog("Digite a categoria do alimento " + (nomeAlimento.get(i))));
			valorCalorico.add(Double.parseDouble(
					JOptionPane.showInputDialog("Quantas calorias tem o alimento " + (nomeAlimento.get(i)))));

			if (categoriaAlimento.get(i).equals("P") || categoriaAlimento.get(i).equals("p")) {
				proteinas.add(contadorProteina, nomeAlimento.get(i));
				contadorProteina++;
				caloriasProteina += valorCalorico.get(i);

			}

			else if (categoriaAlimento.get(i).equals("G") || categoriaAlimento.get(i).equals("g")) {
				gorduras.add(contadorGordura, nomeAlimento.get(i));
				contadorGordura++;
				caloriasGordura += valorCalorico.get(i);
			}

			else if (categoriaAlimento.get(i).equals("C") || categoriaAlimento.get(i).equals("c")) {
				carboidratos.add(contadorCarboidrato, nomeAlimento.get(i));
				contadorCarboidrato++;
				caloriasCarboidrato += valorCalorico.get(i);
			}

		}

		if (caloriasProteina > caloriasGordura && caloriasProteina > caloriasCarboidrato) {
			maiorCalorias = "Prote�na possui mais calorias";
		} else if (caloriasCarboidrato > caloriasGordura && caloriasCarboidrato > caloriasProteina) {
			maiorCalorias = "Carboidrato possui mais calorias";
		} else if (caloriasGordura > caloriasProteina && caloriasGordura > caloriasCarboidrato) {
			maiorCalorias = "Gordura possui mais calorias";
		}

		// Impress�o Carboidratos
		System.out.println("Carboidratos\n==============");

		System.out.println(carboidratos.toString());

		System.out.println("\nCalorias Totais Carboidratos => " + caloriasCarboidrato);

		// Impress�o Gorduras
		System.out.println("\nGorduras\n==============");

		System.out.println(gorduras.toString());

		System.out.println("\nCalorias Totais Gorduras => " + caloriasGordura);

		// Impress�o Prote�nas
		System.out.println("\nProte�nas\n==============");

		System.out.println(proteinas.toString());

		System.out.println("\nCalorias Totais Prote�nas => " + caloriasProteina);

		// Impress�o do Maior
		System.out.println(maiorCalorias);
	}
}
