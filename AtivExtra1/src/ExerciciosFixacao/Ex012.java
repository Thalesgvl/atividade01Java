package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex012 {

	public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog("Digite um número para ver a tabuada: ");

        int numero = Integer.parseInt(numeroStr);

        String tabela = "Tabuada de: " + numero + "\n";

        for (int i = 1; i <= 10; i++) {
            int resultado = i * numero;
            tabela += i + " x " + numero + " = " + resultado + "\n";
            }

        JOptionPane.showMessageDialog(null, tabela);
    }
}

