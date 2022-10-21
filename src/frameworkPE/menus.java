package frameworkPE;

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
    
    
    /*								INT			 						*/
	/*					WHILE INTERRUTOR REFACTORIZAR					*/
    /*
    public static void whileInterruptor(){
		boolean interruptor = false;
		while(interruptor==false){
			if(CONDICIÓN PARA SALIR){
				interruptor = true;
			}else{
				OPERACIÓNES A REALIZAR
			}
		}//end_while
	}
	*/
	
	/*								INT			 						*/
	/*					FOR N NÚMEROS REFACTORIZAR						*/
	/*
	public static void nNumeros(){
		int n = 0;
		n = validar.solicitarNum();
		for(int i=1;i<=n;i++){
			OPERACIÓNES A REALIZAR 
		}//end_for
	}
	*/

	/*								INT			 						*/
	/*					FOR 5 PRIMEROS REFACTORIZAR						*/
	/*
    public static void cincoPrimerosNums(){
		for(int i=1;i<=5;i++){
			OPERACIÓNES A REALIZAR 
		}//end_for
		
	}
	*/

	/*								INT			 						*/
	/*						DÍGITOS REFACTORIZAR						*/
	/*
	public static void obtenerDigitos(){
		int copia = 0;
		int num = 0;
		int digito = 0;
		num = validar.solicitarNum();
		copia = num;
		while(num>0){
			digito = num%10;
			num = num/10;
			//System.out.println(digito);
		}
	}
	*/

	/*								INT			 						*/
	/*						DIVISORES REFACTORIZAR						*/
	/*
	public static void obtenerDivisores(){
		int divisor = 0;
		int num = 0;
		num = validar.solicitarNum();
		for(int i=1;i<=num;i++) {
			divisor = 0;
			if(num%i==0) {
				divisor = i;
				System.out.println(divisor);
			}
		}
	}
	*/

	/*								INT			 						*/
	/*						MENOR Y MAYOR REFACTORIZAR					*/
	/*
	public static void menorYmayor(){
		int pivot = 0;
		int major = 0;
		int menor = 0;
		int num = 0;
		num = validar.solicitarNum();
		if (pivot == 0) {
			pivot++;
			major = num;
			menor = num;
		}else {
			if(num>major) {
				major = num;
			}
			if(num<menor) {
				menor = num;
			}
		}
		System.out.println(major);
	}
	*/
 
}

