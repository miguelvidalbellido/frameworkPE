package calculadora;

import javax.swing.JOptionPane;

public class validar {

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

