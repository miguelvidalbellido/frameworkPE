package ejercicios;

public class divisores {
    /*
        TODO SOBRE DIVISORES -->
        
            - Obten los divisores de un número P/ REFACTORIZAR
           [1] -  Suma de los divisores de un número
           [2] -  Producto de los divisores de un número
           [3] -  Cantidad de divisores de un número
           [4] -  Cantidad de divisores pares de un número
           [5] -  Cantidad de divisores impares de un número
           [6] -  Suma de los divisores pares de un número
           [7] -  Suma de los divisores impares de un número
           [8] -  Producto de los divisores pares de un número
           [9] -  Producto de los divisores impares de un número
           [10] - Cantidad de divisores pares e impares de un número {ARRAY}
           [11] - Suma de divisores pares e impares de un número {ARRAY}
           [12] - Producto de divisores pares e impares de un número {FALTA}
    */

	/* 1							SUMA DE DIVISORES						*/
    public static int sumaDeDivisores(){
        int num = 0;
        int resultado = 0;
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){
                resultado = resultado+i;
            }
        }
        return resultado;
    }

    /* 2							PRODUCTO DE DIVISORES						*/
    public static float productoDeDivisores(){
        int num = 0;
        float resultado = 1; // Al ser el producto la declarámos en 1, de lo contrario daría 0 el resultado
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){
                resultado = resultado*i;
            }
        }
        return resultado;
    }

    /* 3						CANTIDAD DE DIVISORES						*/
    public static int numeroDeDivisores(){
        int num = 0;
        int cont = 0;
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){
                cont++;
            }
        }
        return cont;
    }

    /* 4					CANTDAD DE DIVISORES PARES						*/
    public static int numeroDeDivisoresPares(){
        int num = 0;
        int cont = 0;
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)==0){// comprobamos si es par
                    cont++;
                }
            }
        }
        return cont;
    }

    /* 5					CANTDAD DE DIVISORES IMPARES					*/
    public static int numeroDeDivisoresImpares(){
        int num = 0;
        int cont = 0;
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)!=0){// comprobamos si es impar
                    cont++;
                }
            }
        }
        return cont;
    }

    /* 6					SUMA DE LOS DIVISORES PARES						*/
    public static int sumaDeDivisoresPares(){
        int num = 0;
        int suma = 0;
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)==0){// comprobamos si es par
                    suma=suma+i;
                }
            }
        }
        return suma;
    }

    /* 7					SUMA DE LOS DIVISORES IMPARES						*/
    public static int sumaDeDivisoresImpares(){
        int num = 0;
        int suma = 0;
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)!=0){// comprobamos si es impar
                    suma=suma+i;
                }
            }
        }
        return suma;
    }
    
    /* 8					PRODUCTO DE LOS DIVISORES PARES						*/
    public static int productoDeDivisoresPares(){
        int num = 0;
        int producto = 1;// se declara a 1
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)==0){// comprobamos si es par
                    producto = producto*i;
                }
            }
        }
        return producto;
    }

    /* 9					PRODUCTO DE LOS DIVISORES IMPARES						*/
    public static int productoDeDivisoresImpares(){
        int num = 0;
        int producto = 1;// se declara a 1
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)!=0){// comprobamos si es impar
                    producto = producto*i;
                }
            }
        }
        return producto;
    }

    /* 10					CANTIDAD DE LOS DIVISORES PARES E IMPARES						*/
    public static String[] cantidadDeDivisoresParesImpares(){
        int cont_par = 0; int cont_impar = 0;int num = 0;
        String[] resultado = new String[4];
        String contador_pares = ""; String contador_impares = ""; 
        num = validar.solicitarNum();
        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)==0){// comprobamos si es par
                    cont_par++;
                }
                if((i%2)!=0){// comprobamos si es impar
                    cont_impar++;
                }
            }
        }
        contador_pares = contador_pares+cont_par;
        contador_impares = contador_impares+cont_impar;
        resultado[0] = "pares"; resultado[1] = contador_pares; resultado[2] = "impares"; resultado[3] = contador_impares; 
        return resultado;

        // MANUAL DE EJECUCIÓN
        // String[] a_mostrar = divisores.cantidadDeDivisoresParesImpares();
		// System.out.println(a_mostrar[0]);
		// System.out.println(a_mostrar[1]);
		// System.out.println(a_mostrar[2]);
		// System.out.println(a_mostrar[3]);

    }

    /*          SUMA DE DIVISORES PARES E IMPARES        */
    public static String[] sumaDeDivisoresParesImpares(){
        int suma_par = 0; int suma_impa = 0; int num = 0;
        String[] resultado = new String[4];
        String suma_pares = ""; String suma_impares = "";

        num = validar.solicitarNum();

        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)==0){// comprobamos si es par
                    suma_par = suma_par+i;
                }
                if((i%2)!=0){// comprobamos si es impar
                    suma_impa = suma_impa+i;
                }
            }
        }
        suma_pares = suma_pares+suma_par;
        suma_impares = suma_impares+suma_impa;
        resultado[0] = "Suma pares"; resultado[1] = suma_pares; resultado[2] = "Suma impares"; resultado[3] = suma_impares; 
        return resultado;

        // MANUAL DE EJECUCIÓN
        // String[] a_mostrar = divisores.sumaDeDivisoresParesImpares();
		// System.out.println(a_mostrar[0]);
		// System.out.println(a_mostrar[1]);
		// System.out.println(a_mostrar[2]);
		// System.out.println(a_mostrar[3]);
    }

    /*          PRODUCTO DE DIVISORES PARES E IMPARES        */
    public static String[] productoDeNumerosParesImpares(){
        int prod_par = 1; int prod_impa = 1; int num = 0;
        String[] resultado = new String[4];
        String producto_pares = ""; String producto_impares = "";

        num = validar.solicitarNum();

        for(int i=1;i<=num;i++){
            if((num%i)==0){// comprobamos si es divisor
                if((i%2)==0){// comprobamos si es par
                    prod_par=prod_par*i;
                }
                if((i%2)!=0){// comprobamos si es impar
                    prod_impa=prod_impa*i;
                }
            }
        }
        producto_pares = producto_pares+prod_par;
        producto_impares = producto_impares+prod_impa;
        resultado[0] = "Producto pares"; resultado[1] = producto_pares; resultado[2] = "Producto impares"; resultado[3] = producto_impares; 
        return resultado;

        // MANUAL DE EJECUCIÓN
        // String[] a_mostrar = divisores.productoDeNumerosParesImpares();
		// System.out.println(a_mostrar[0]);
		// System.out.println(a_mostrar[1]);
		// System.out.println(a_mostrar[2]);
		// System.out.println(a_mostrar[3]);
    }
}
