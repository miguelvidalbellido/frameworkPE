package frameworkPE;

import javax.swing.JOptionPane;

public class libraryPE {

	/*								INT								*/
	/*							SOLICITAR NUM						*/
	public static int solicitarNum(String message, String title){
		String cad = "";
		int num = 0;
		boolean correct = false;

		do{
			try{
				cad=JOptionPane.showInputDialog(null, message, title,JOptionPane.QUESTION_MESSAGE);
				if(cad==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0); // exit
				}else {
					num=Integer.parseInt(cad);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
			
		return num;
	}

	/*								INT			 						*/
	/*							SUMAR DOS NÚMEROS						*/
	public static int sumar(int n1, int n2){
		int suma = 0;
		suma = n1 + n2;
		return suma;
	}

	/*								INT			 						*/
	/*							RESTAR DOS NÚMEROS						*/
	public static int restar(int n1, int n2){
		int resta = 0;
		resta = n1 - n2;
		return resta;
	}

	/*								INT			 						*/
	/*							DIVIDIR DOS NÚMEROS						*/
	public static float dividir(float n1, float n2){
		float division = 0.0f;
		division = n1/n2;
		return division;
	}

	/*								INT			 						*/
	/*						MULTIPLCIAR DOS NÚMEROS						*/
	public static int multiplicar(int n1, int n2){
		int multiplicacion = 0;
		multiplicacion = n1*n2;
		return multiplicacion;
	}

	/*								INT			 						*/
	/*							OBTENER LA MEDIA						*/
	public static float media(int n1, int n2){
		float average = 0.0f;
		int suma = 0;
		if(suma!=0){
			average = suma/2;
		}
		return average;
	}

	/*								CHAR								*/
	/*							SOLICITAR CHAR							*/
	public static char solicitarChar(String message, String title){
		String cad = "";
		char character = 0;
		boolean correct = false;

		do{
			try{
				cad=JOptionPane.showInputDialog(null, message, title,JOptionPane.QUESTION_MESSAGE);
				if(cad==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					character=cad.charAt(0);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una letra", "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		return character;
	}
	
}
