package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex010 {

	public static void main(String[] args) {
		
		String numStr = JOptionPane.showInputDialog(null,"Digite um número inicial: ");
		int num = Integer.parseInt(numStr);
		
		JOptionPane.showMessageDialog(null,"Valor inicial: " + num);
		while (num >= 1) {
			JOptionPane.showMessageDialog(null, num);
			num--;
		}
	}
}
