package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex013 {

	public static void main(String[] args) {
		
		
		String tamStr = JOptionPane.showInputDialog("Qual o tamanho do vetor?: ");
		int tam = Integer.parseInt(tamStr);
		int vet1 [] = new int[tam];
		int vet2 [] = new int[tam];
		int vet3 [] = new int[tam];
		
		for (int i = 0; i < vet1.length; i++) {
			String numStr = JOptionPane.showInputDialog("Informe os elementos do primeiro vetor [" + i + "]: ");
			int num = Integer.parseInt(numStr);
			vet1[i] = num;
		}
		
		for (int i = 0; i < vet2.length; i++) {
			String numStr = JOptionPane.showInputDialog("Informe os elementos do segundo vetor [" + i + "]: ");
			int num = Integer.parseInt(numStr);
			vet2[i] = num;
		}
		
		String resposta = "A soma dos vetores é: [";

        for (int i = 0; i < tam; i++) {
            vet3[i] = vet1[i] + vet2[i];
            if (i < tam -1) {
            	resposta += vet3[i] + ", ";
            	}else {
            		resposta += vet3[i];
            	}
            }
        resposta += "]";

        JOptionPane.showMessageDialog(null, resposta);
		
		
		
		
		
		

	}

}
