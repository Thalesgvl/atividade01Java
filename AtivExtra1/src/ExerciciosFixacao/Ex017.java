package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex017 {
	public static void main(String[] args) {
        // M1
        String mStr = JOptionPane.showInputDialog("Informe o número de linhas das matrizes: ");
        int m = Integer.parseInt(mStr);

        String nStr = JOptionPane.showInputDialog("Informe o número de colunas das matrizes M1 e M2: ");
        int n = Integer.parseInt(nStr);

        int M1[][] = new int[m][n];
        int M2[][] = new int[n][m];

        // Inserir valores para M1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String valorStr = JOptionPane.showInputDialog("Informe o valor para M1[" + (i + 1) + "][" + (j + 1) + "]: ");
                M1[i][j] = Integer.parseInt(valorStr);
            }
        }

        // Inserir valores para M2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String valorStr = JOptionPane.showInputDialog("Informe o valor para M2[" + (i + 1) + "][" + (j + 1) + "]: ");
                M2[i][j] = Integer.parseInt(valorStr);
            }
        }

        //multiplicação de matrizes
        int result[][] = new int[m][m];  

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }

        // Exibir o resultado
        String resposta = "Resultado da Multiplicação: \n";
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                resposta += result[i][j] + " ";
            }
            resposta += "\n";
        }

        JOptionPane.showMessageDialog(null, resposta);
    }
}