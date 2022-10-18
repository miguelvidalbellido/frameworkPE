package calculadora;

import javax.swing.*;

public class libreriaCalculadora {

    /*				SUMA				*/
    public static void calcSuma(){
    	int n1 = 0; int n2 = 0; int resultado = 0;
    	String pintar = "";
        int continuar = 0;
        while(continuar==0) {
        	n1 = validar.solicitarNum("Introduce un número","[INT]");
    		n2 = validar.solicitarNum("Introduce un número","[INT]");
			pintar = n1+" + "+n2+" = ";
			resultado = operacions.sumar(n1,n2);
			pintar = pintar + resultado;
			JOptionPane.showMessageDialog(null, pintar,"Resultado",JOptionPane.INFORMATION_MESSAGE);
			continuar = menus.deseaContinuar("¿Desea realizar otra suma?");
			}
    }
    
	/*				RESTA				*/
    public static void calcResta() {
		int n1 = 0; int n2 = 0; int resultado = 0;
    	String pintar = "";
        int continuar = 0;
    	while(continuar==0) {
			n1 = validar.solicitarNum("Introduce un número","[INT]");
			n2 = validar.solicitarNum("Introduce un número","[INT]");
			pintar = n1+" - "+n2+" = ";
			resultado = operacions.restar(n1,n2);
			pintar = pintar + resultado;
			JOptionPane.showMessageDialog(null, pintar,"Resultado",JOptionPane.INFORMATION_MESSAGE);
			continuar = menus.deseaContinuar("¿Desea realizar otra resta?");
			}
    }
    


	/*				DIVISIÓN				*/
	public static void calcDivision(){
		int n1 = 0; int n2 = 0; int resultado = 0;
    	String pintar = "";
        int continuar = 0;
		while(continuar==0) {
			n1 = validar.solicitarNum("Introduce un número","[INT]");
			n2 = validar.solicitarNum("Introduce un número","[INT]");
			pintar = n1+" / "+n2+" = ";
			resultado = operacions.dividir(n1,n2);
			pintar = pintar + resultado;
			JOptionPane.showMessageDialog(null, pintar,"Resultado",JOptionPane.INFORMATION_MESSAGE);
			continuar = menus.deseaContinuar("¿Desea realizar otra división?");
		}
	}

	/*				MULTIPLICACIÓN				*/
	public static void calcMultiplicacion(){
		int n1 = 0; int n2 = 0; int resultado = 0;
    	String pintar = "";
    	int continuar = 0;
		while(continuar==0) {
			n1 = validar.solicitarNum("Introduce un número","[INT]");
			n2 = validar.solicitarNum("Introduce un número","[INT]");
			pintar = n1+" x "+n2+" = ";
			resultado = operacions.multiplicar(n1,n2);
			pintar = pintar + resultado;
			JOptionPane.showMessageDialog(null, pintar,"Resultado",JOptionPane.INFORMATION_MESSAGE);
			continuar = menus.deseaContinuar("¿Desea realizar otra multiplicación?");
		}
	}
	/*				SWITCH COMPLETO CALCULADORA				*/
	public static void switchCalculadora(){
		String[] opciones = {"suma", "resta", "division", "multiplicación"};
		int seleccion = 0;
		int seguir = 0;
		

		while(seguir==0){
		seleccion = menus.menuBotons(opciones,"asdasd","Calculadora");
			switch (seleccion){
				case 0: libreriaCalculadora.calcSuma(); break;
				case 1: libreriaCalculadora.calcResta(); break;
				case 2: libreriaCalculadora.calcDivision(); break;
				case 3: libreriaCalculadora.calcMultiplicacion(); break;
				default: break;
			}//end_switch
			seguir = menus.deseaContinuar("¿Desea realizar otra operación?");
		}//end_while
		JOptionPane.showMessageDialog(null, "Saliendo...","Saliendo",JOptionPane.INFORMATION_MESSAGE);
	}
}
