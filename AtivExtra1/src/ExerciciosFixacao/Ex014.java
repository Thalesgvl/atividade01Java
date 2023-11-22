package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex014 {

    public static void main(String[] args) {
        String tamStr = JOptionPane.showInputDialog("Qual o tamanho do vetor?: ");
        int tam = Integer.parseInt(tamStr);
        float vet1[] = new float[tam];
        float vet2[] = new float[tam];
        float vet3[] = new float[tam];

        for (int i = 0; i < vet1.length; i++) {
            String numStr = JOptionPane.showInputDialog("Informe os elementos do primeiro vetor [" + i + "]: ");
            float num = Float.parseFloat(numStr);
            vet1[i] = num;
        }

        for (int i = 0; i < vet2.length; i++) {
            String numStr = JOptionPane.showInputDialog("Informe os elementos do segundo vetor [" + i + "]: ");
            float num = Float.parseFloat(numStr);
            vet2[i] = num;
        }

        float produto = 0;
        

        for (int i = 0; i < tam; i++) {
            vet3[i] = vet1[i] * vet2[i];
            produto += vet3[i];
            
        }
        String resposta = "O produto dos vetores é: " + produto;

        JOptionPane.showMessageDialog(null, resposta);

    }
}