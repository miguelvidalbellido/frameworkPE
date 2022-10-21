package frameworkPE;

public class digitos {

    // IMPORTANTE --> SI EL NOMBRE DE FUNCIÓN CONTIENE [S______] SOLICITARA EL NUM AL USUARIO DENTRO
    //            --> SI EL NOMBRE DE FUNCIÓN CONTIENE [P______] DEBEREMOS INTRODUCIR EL NUM AL LLAMAR A LA FUNCIÓN
    /*
        TODO SOBRE DÍGITOS -->
        
            [1]  - SUMA de los dígitos de un número
            [2]  - SUMA de los dígitos PARES de un número
            [3]  - SUMA de los dígitos IMPARES de un número
            [4]  - PRODUCTO de los dígitos de un número
            [5]  - PRODUCTO de los dígitos PARES de un número
            [6]  - PRODUCTO de los dígitos IMPARES de un número
            [7]  - CANTIDAD de dígitos PARES de un número
            [8]  - CANTIDAD de dígitos IMPARES de un número
            [9]  - DÍGITO MAYOR de un número
            [10] - DÍGITO MENOR de un número
    */

    /* 1        SUMA DE LOS DÍGITOS          */
    public static int sumaDigitos(int num){
        int suma = 0; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            suma = suma+digito;
        }
        return suma;
    }

    /* 2        SUMA DE LOS DÍGITOS PARES          */  // [SOLICITA NUM DENTRO]
    public static int sumaDigitosPares(int num){
    	int suma = 0; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            if((digito%2)==0){
                suma = suma+digito;
            }
        }
        return suma;
    } 

    /* 3       SUMA DE LOS DÍGITOS IMPARES          */ // [SOLICITA NUM DENTRO]
    public static int sumaDigitosImpares(int num){
        int suma = 0; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            if((digito%2)!=0){
                suma = suma+digito;
            }
        }
        return suma;
    } 

    /* 4       PRODUCTO DE LOS DÍGITOS          */ 
    public static int productoDigitos(int num){
        int producto = 1; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            producto = producto*digito;
        }
        return producto;
    }

    /* 5       PRODUCTO DE LOS DÍGITOS PARES          */ 
    public static int productoDigitosPares(int num){
        int producto = 1; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            if((digito%2)==0){
                producto = producto*digito;
            }
        }
        return producto;
    }

    /* 6       PRODUCTO DE LOS DÍGITOS IMPARES          */ 
    public static int productoDigitosImpares(int num){
    	int producto = 1; int copia = 0; int digito = 0;;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            if((digito%2)!=0){
                producto = producto*digito;
            }
        }
        return producto;
    }

    /* 7      CANTIDAD DE LOS DÍGITOS PARES         */  
     public static int cantidadDigitosPares(int num){
    	int cont = 0; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            if((digito%2)==0){
                cont++;
            }
        }
        return cont;
    }    
     /* 8      CANTIDAD DE LOS DÍGITOS          */  
     public static int cantidadDigitos(int num){
    	int cont = 0; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            cont++;
        }
        return cont;
    }
     
     /* 9      CANTIDAD DE LOS DÍGITOS PARES         */  
     public static int cantidadDigitosImpares(int num){
    	int cont = 0; int copia = 0; int digito = 0;
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            if((digito%2)!=0){
                cont++;
            }
        }
        return cont;
    }
     
    /* 10		MEDIA DE LOS DÍGITOS */
     public static float mediaDigitos(int num){
         int suma = 0;// se declara a 1
         int cont = 0;
         int digito = 0;
         float resultado=0.0f;
         while(num>0){
             digito = num%10;
             num = num/10;
             suma = suma+digito;
             cont++;
         }
             resultado = operacions.media(suma, cont);
         return resultado;
     }
     /* 11		MEDIA DE LOS DÍGITOS  Pares*/
     public static float mediaDigitosPares(int num){
         int suma = 0;// se declara a 1
         int cont = 0;
         int digito = 0;
         float resultado=0.0f;
         while(num>0){
        	 digito = num%10;
             num = num/10;
        	 if((digito%2)==0) {
        		 suma = suma+digito;
                 cont++;
        	 }
         }
             resultado = operacions.media(suma, cont);
         return resultado;
     }
     
     /* 12		MEDIA DE LOS DÍGITOS Impares*/
     public static float mediaDigitosImpares(int num){
         int suma = 0;// se declara a 1
         int cont = 0;
         int digito = 0;
         float resultado=0.0f;
         while(num>0){
        	 digito = num%10;
             num = num/10;
        	 if((digito%2)!=0) {
        		 suma = suma+digito;
                 cont++;
        	 }
         }
             resultado = operacions.media(suma, cont);
         return resultado;
     } 
}
