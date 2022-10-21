package frameworkPE;

public class xprimeros {
/* N NÚMEROS */
	// contadores
    	// cont divisores
	    public static void contadorDivisores(int limitador){
	        int num = 0;
	        String resultado = "";
	        int cant_divisores = 0;
            int cont = 1;
            while(cont<=limitador){
                cant_divisores = 0;
	            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
	            cant_divisores = divisores.numeroDeDivisores(num);
                if(cant_divisores > 10){
                cont++;
	            resultado = resultado + "El número "+num+" tiene "+cant_divisores+" divisores."+'\n';
                }
            }
	        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	        
	    }
}