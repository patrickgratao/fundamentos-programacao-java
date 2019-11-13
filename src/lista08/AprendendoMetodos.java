import javax.swing.JOptionPane;

public class AprendendoMetodos {
	public static void main(String[] args) {
		double a = Double.parseDouble(entradaDados("Digite um valor para A"));
		double b = Double.parseDouble(entradaDados("Digite um valor para B"));
		
		System.out.println(soma(a,b));
		String nome = "Lucas";
		sayHello(nome);
		
		System.out.println(fatorial(6));
	}
	
	public static double soma (double n1, double n2) {
		return n1 + n2;
	}
	
	public static void sayHello (String nome) {
		System.out.println("Olá, "+nome);
	}
	
	public static String entradaDados (String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	public static int fatorial (int numero) {
		int fat = 1;
		for (int i = 1; i <= numero; i++) {
			fat *= i;
		}
		return fat;
	}
}
