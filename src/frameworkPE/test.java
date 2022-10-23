package frameworkPE;
import frameworkPE.*;
import javax.swing.*;
public class test {

	public static void main(String[] args) {
		// APARTADO DE TESTEO
		String text = "texto";
		String desc = "asd";
		String quest = "sadas";
		String[] option = {"Ejer1", "volver", "continuar"};
			int sel = 0;
			int confirm = 0;
			do {
				sel = JOptionPane.showOptionDialog(null,text,desc,0,JOptionPane.QUESTION_MESSAGE,null,option,option[0]);	
				System.out.println("User choose: " + sel);
				if (sel == -1) {
					confirm = JOptionPane.OK_OPTION;
				}
				else {
					confirm = JOptionPane.showConfirmDialog(null,quest);
				}
			} while (confirm != JOptionPane.OK_OPTION);
		
		System.out.println(confirm);
	}

}
