package ejercicios;

public class digitos {
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
    public static int sumaDigitos(){
        int num = 0; int suma = 0; int copia = 0; int digito = 0;
        num = validar.solicitarNum();
        copia = num;
        while(num>0){
            digito = num%10;
            num = num/10;
            suma = suma+digito;
        }
        return suma;
    }
}
