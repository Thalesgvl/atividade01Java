package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex018 {

	public static void main(String[] args) {
        String mStr = JOptionPane.showInputDialog("Digite o número de linhas da matriz: ");
        int m = Integer.parseInt(mStr);

        String nStr = JOptionPane.showInputDialog("Digite o número de colunas da matriz: ");
        int n = Integer.parseInt(nStr);

        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String valorStr = JOptionPane.showInputDialog("Informe o valor para M1 [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = Integer.parseInt(valorStr);
            }
        }

        // Realizar a transposição da matriz
        int matrizTransposta[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        // Exibir a matriz transposta
        String resultado = "A matriz transposta é:\n";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultado += matrizTransposta[i][j] + " ";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}