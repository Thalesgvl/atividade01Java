package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex015 {

	public static void main(String[] args) {
	    //identificador de palindromo
		
		String palavra = JOptionPane.showInputDialog("Escreva uma palavra: ");
		
		
		String reversa = "";
		
		for(int i = palavra.length() -1; i >= 0; i--) {
			reversa += palavra.charAt(i);
		}
		if (palavra.toLowerCase().equals(reversa.toLowerCase())) {
			JOptionPane.showMessageDialog(null, "É palíndromo!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Não é palíndromo");
		}
	
	}


		
}

