package ejercicios;

import javax.swing.JOptionPane;

public class menus {

    /*								INT								*/
	/*							DESEA CONTINUAR						*/
    public static int deseaContinuar(String mensaje){
        int cont = 0;
        cont = JOptionPane.showConfirmDialog(null,mensaje);
        return cont;
    }

    /*								INT								*/
	/*						DESEA CONTINUAR BOOLEAN					*/
    public static boolean deseaContinuarBoolean(String mensaje){
        boolean resultado = false;
        int cont = 0;
        cont = JOptionPane.showConfirmDialog(null,mensaje);
        if(cont==JOptionPane.OK_OPTION){
            resultado = false;
        }else{
            resultado = true;
        }
        return resultado;
    }

    /*								INT								*/
	/*							    BOTONS  						*/
    public static int menuBotons(String[] opciones, String titulo, String mensaje){
        int op = 0;
        op = JOptionPane.showOptionDialog(null, mensaje, titulo, 0,JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        return op;
    }
    
    /*								INT								*/
	/*				WHILE INTERRUPTOR P/ REFACTORIZAR				*/
    
    public static void whileInterruptor() {
    	boolean interruptor = false;
    	
    	while(interruptor==false) {
    		if(CONDICIÓN) {
    			interruptor = true;
    		}else
    	}
    }
    
    /*								INT								*/
	/*				FOR N NUMEROS P/ REFACTORIZAR					*/
    
    /*								INT								*/
	/*				WHILE 5 PRIMEROS P/ REFACTORIZAR				*/
    
    /*								INT								*/
	/*						DIVISORS P/ REFACTORIZAR				*/
    
    /*								INT								*/
	/*						DIGITS P/ REFACTORIZAR					*/
    
    /*								INT								*/
	/*					MAJOR I MENOR P/ REFACTORIZAR				*/
 
}

