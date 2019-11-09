package lista07;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SortArrays {
	public static void main(String[] args) {
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero "));
		}
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
	}
}
