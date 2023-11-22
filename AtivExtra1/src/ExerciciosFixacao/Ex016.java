package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex016 {
	
	public static void main(String[] args) {
		
        String mStr = JOptionPane.showInputDialog("Digite o número de linhas das matrizes: ");
        int m = Integer.parseInt(mStr);

        String nStr = JOptionPane.showInputDialog("Digite o número de colunas das matrizes: ");
        int n = Integer.parseInt(nStr);

        int matriz1[][] = new int[m][n];
        int matriz2[][] = new int[m][n];

        // Preencher a primeira matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String valorStr = JOptionPane.showInputDialog("Informe o valor para M1[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz1[i][j] = Integer.parseInt(valorStr);
            }
        }

        // Preencher a segunda matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String valorStr = JOptionPane.showInputDialog("Informe o valor para M2[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz2[i][j] = Integer.parseInt(valorStr);
            }
        }

        // Calcular a soma
        int matrizSoma[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibir a matriz resultante
        String resultado = "M1 + M2 = \n";
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultado += matrizSoma[i][j] + " ";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

