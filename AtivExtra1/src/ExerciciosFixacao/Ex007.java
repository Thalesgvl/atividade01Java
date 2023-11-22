package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex007 {

	public static void main(String[] args) {

		int num;
		String numStr = JOptionPane.showInputDialog("Digite um número: ");
		num = Integer.parseInt(numStr);
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número: " + num + ". É par!");
		}else {
			JOptionPane.showMessageDialog(null, "O número: " + num + ". É ímpar!");
		}
	}

}
