package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex005 {

	public static void main(String[] args) {
		
		int idade;
		
		float idadeAnos,
			  idadeMeses,
			  idadeDias,
			  idadeHoras,
			  idadeMinutos;
		
		String strIdade = JOptionPane.showInputDialog("Informe sua idade (em anos): ");
		idade = Integer.parseInt(strIdade);
		
		idadeAnos = idade;
		idadeMeses = idade * 12;
		idadeDias = idadeMeses * 30;
		idadeHoras = idadeDias * 24;
		idadeMinutos = idadeHoras * 30;
		
		JOptionPane.showMessageDialog(null,"-=-=- IDADE DO USUÁRIO: " + idade + " -=-=-" + "\n" +
										   "IDADE EM ANOS: " + idadeAnos + "\n" +
							               "IDADE EM MESES: " + idadeMeses + "\n" +
										   "IDADE EM DIAS: " + idadeDias + "\n" +
							               "IDADE EM HORAS: " + idadeHoras + "\n" +
										   "IDADE EM MINUTOS: " + idadeMinutos);
		
		
		
		
	}

}
