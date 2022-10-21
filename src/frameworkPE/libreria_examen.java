package frameworkPE;

import javax.swing.JOptionPane;

public class libreria_examen {
	public static void menu() {
		String[] opciones = {"ejer1", "ejer2", "ejer3", "exit"};
		int op = 0;
		boolean continuar = false;
		
		while(continuar==false) {
		op = menus.menuBotons(opciones,"Menu_inicial","Selecciona un ejercicio");
		switch(op) {
			case 0:
				ejer1();
				break;
			case 1:
				ejer2();
				break;
			case 2:
				ejer3();
				break;
			case 3:
				continuar = true;
				JOptionPane.showMessageDialog(null, "Saliendo", "Error",JOptionPane.ERROR_MESSAGE);
				break;
			default:
				break;
		}
		}
	}
	
	public static void ejer1() {
		int continuar = 0;
		while(continuar==0) {
			nnumeros.mediaDigitosImpares();
			continuar = menus.deseaContinuar("¿Desea continuar?");
		}
	}
	
	public static void ejer2() {
		int continuar = 0;
		while(continuar==0) {
			nnumeros.sumaDigitosImpares();
			continuar = menus.deseaContinuar("¿Desea continuar?");
		}
		
	}
	
	public static void ejer3() {
		int continuar = 0;
		while(continuar==0) {
			nnumeros.sumaDigitosPares();
			continuar = menus.deseaContinuar("¿Desea continuar?");
		}
		
	}
}
