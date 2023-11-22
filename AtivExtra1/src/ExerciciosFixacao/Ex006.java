package ExerciciosFixacao;

import javax.swing.JOptionPane;
public class Ex006 {

		public static void main(String[] args) {
			
			//declaração var
			
			String strAltura, strPeso, situacao;
			float fAltura, fPeso, imc;
			
			//interação / interface
			
			strPeso = JOptionPane.showInputDialog("Informe o peso (Kg): ");
			strAltura = JOptionPane.showInputDialog("Informe a altura(m): ");
			
			//type-casting, down-casting
			
			fPeso = Float.parseFloat(strPeso);
			fAltura = Float.parseFloat(strAltura);
			
			//método imc
			
			imc = fPeso / (fAltura * fAltura);
			
			if(imc < 18.5) {
				situacao = " Abaixo do peso ideal.";
			}else if (imc > 18.5 && imc < 24.5) {
				situacao = " Peso ideal.";
			}else if (imc > 24.5 && imc < 30) {
				situacao = " Sobrepeso.";
			}else
				situacao = " Obesidade.";
			
			// output
			
			String resposta = "Seu IMC foi de: " + imc + ". Sua situação é de: " + situacao;
					
			JOptionPane.showMessageDialog(null, resposta);
							
			
		}
		}



