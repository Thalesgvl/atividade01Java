package ExerciciosFixacao;

import javax.swing.JOptionPane;

public class Ex008 {

	public static void main(String[] args) {
			//Crie um programa que seja capaz de fazer a leitura de dois valores inteiros a e b, e realize as seguintes operações:
			//A+B, A-B, A*B, A/B, A^B.
			
			int soma, subt, mult;
			float div;
			String aStr = JOptionPane.showInputDialog("Digite um valor para 'a': ");
			int a = Integer.parseInt(aStr);
			
			String bStr = JOptionPane.showInputDialog("Digite um valor para 'b': ");
			int b = Integer.parseInt(bStr);
			
			soma = a + b;
			subt = a - b;
			mult = a * b;
			div = (float)a / b;
			
			String opStr = JOptionPane.showInputDialog("-=-=- Escolha uma operação: -=-=-" + "\n" +
													   "1 - Adição" + "\n" +
													   "2 - Subtração" + "\n" +
													   "3 - Multiplicação" + "\n" +
													   "4 - Divisão");
			int op = Integer.parseInt(opStr);
			
			
			switch (op) {
			case 1:
				JOptionPane.showMessageDialog(null,"A soma entre: " + a + " e " + b + " é igual a: " + soma + ".");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"A subtração entre: " + a + " e " + b + " é igual a: " + subt + ".");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"A multiplicação entre: " + a + " e " + b + " é igual a: " + mult + ".");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"A divisão entre: " + a + " e " + b + " é igual a: " + div + ".");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida.");
				
				
				
			
			}
		}
	}



