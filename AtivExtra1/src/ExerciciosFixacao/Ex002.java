package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex002 {

	public static void main(String[] args) {
	
		String opcaoStr;
		int opcaoInt;
		
		opcaoStr = JOptionPane.showInputDialog(null, "Escolha o tipo de conversão:\r\n"
												   + "1. Celsius para Fahrenheit\r\n"
												   + "2. Fahrenheit para Celsius");
		opcaoInt = Integer.parseInt(opcaoStr);
		
		if(opcaoInt == 1) {
		
			String tempCStr = JOptionPane.showInputDialog(null, "Digite a temperatura em graus Celsius: ");
			
			float tempCFloat = Float.parseFloat(tempCStr);
			float tempFFloat = (float) (1.8 * tempCFloat + 32);
			JOptionPane.showMessageDialog(null, "Resultado em graus Fahrenheit:" + tempFFloat);
		
		}if(opcaoInt == 2) {
		
			String tempFStr = JOptionPane.showInputDialog(null, "Digite a temperatura em graus Fahrenheit: ");
			
			float tempFFloat = Float.parseFloat(tempFStr);
			float tempCFloat = (float) ((tempFFloat - 32) / 1.8);
			JOptionPane.showMessageDialog(null, "Resultado em graus Celsius: " + tempCFloat);
			
			}
		}
	}
