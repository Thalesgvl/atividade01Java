package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex004 {

	public static void main(String[] args) {
		
		float n1,
			  n2,
			  n3;
		
		float peso1,
			  peso2,
			  peso3;
				
		String strN1 = JOptionPane.showInputDialog("Nota 1: ");
		n1 = Float.parseFloat(strN1);
		String strP1 = JOptionPane.showInputDialog("Peso da nota 1: ");
		peso1 = Float.parseFloat(strP1);

		
		String strN2 = JOptionPane.showInputDialog("Nota 2: ");
		n2 = Float.parseFloat(strN2);
		String strP2 = JOptionPane.showInputDialog("Peso da nota 2: ");
		peso2 = Float.parseFloat(strP2);

		
		String strN3 = JOptionPane.showInputDialog("Nota 3: ");
		n3 = Float.parseFloat(strN3);
		String strP3 = JOptionPane.showInputDialog("Peso da nota 3: ");
		peso3 = Float.parseFloat(strP3);
		
		float somaPesos = peso1 + peso2 + peso3;
		float mediaP = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) /somaPesos;
		
		JOptionPane.showMessageDialog(null,"Média ponderada: " + mediaP);
		
	}

}
