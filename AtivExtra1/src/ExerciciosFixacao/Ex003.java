package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex003 {

    public static void main(String[] args) {

        String[] lista = new String[10];
        int i = 0;

        do {
            String opcao = JOptionPane.showInputDialog(null, "Comandos disponíveis:\r\n"
                    + "- \"adicionar\" para adicionar uma nova tarefa\r\n"
                    + "- \"listar\" para listar as tarefas\r\n"
                    + "- \"concluir\" para marcar uma tarefa como concluída\r\n"
                    + "- \"sair\" para sair do programa\r\n");

            if (opcao.equals("adicionar")) {
                String tarefa = JOptionPane.showInputDialog("Digite a descrição da tarefa: ");
                lista[i] = tarefa;
                i++;
                JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
            }

            if (opcao.equals("listar")) {
                StringBuilder listaTarefas = new StringBuilder("Lista de Tarefas:\n");
                for (int i1 = 0; i1 < i; i1++) {
                    listaTarefas.append(i1 + 1).append(". ").append(lista[i1]).append("\n");
                }
                JOptionPane.showMessageDialog(null, listaTarefas.toString());
            }
            
            if (opcao.equals("concluir")) {
            	StringBuilder listaTarefas = new StringBuilder("Qual tarefa deseja concluir?: \n");
                for (int i1 = 0; i1 < i; i1++) {
                    listaTarefas.append(i1 + 1).append(". ").append(lista[i1]).append("\n");
                }
                String opcConcluirStr = JOptionPane.showInputDialog(listaTarefas.toString());
                int opcConcluirInt = Integer.parseInt(opcConcluirStr);
                
                for (int v = 0; v < lista.length; v++) {
                	if (v == opcConcluirInt-1) {
                		lista[v] = lista[v] + " FEITO!";
                		
                	}
                	
                }
                
            }
        } while (!"sair".equals(JOptionPane.showInputDialog("Deseja sair do programa? (Digite \"sair\" para sair)")));
    }
}
