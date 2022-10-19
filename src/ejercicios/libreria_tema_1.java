package ejercicios;
import ejercicios.*;
import javax.swing.JOptionPane;
public class libreria_tema_1 {
	/*
        EJERCICIOS TEMA 1:
        {PDF} - 1 EJER
            1.1 - Diseña un algoritmo que imprima la media de 3 no introducidos por teclado.
            1.2 - Diseña un algoritmo en el que dados 2 no introducidos por teclado, imprima
                  cuál es el mayor y cuál es el menor.
            1.3 - Diseña un algoritmo en el que dados 2 no introducidos por teclado, imprima
                  su valor intercambiado.
            1.4 - Diseña un algoritmo en el que dado 1 no introducido por teclado, imprima su
                  tabla de multiplicar.
            1.5 - Diseña un algoritmo que sume 5 no introducidos por teclado.
            1.6 - Diseña un algoritmo que imprima la suma de no introducidos por teclado. El
                  algoritmo para al introducir un 0.
        {PDF} - 3 EJER

        {PDF} - 4 EJER

        {PDF} - 5 EJER

        {PDF} - 6 EJER
    */

    // MENU PRINCIPAL EJERCICIOS TEMA 1
    
   public static void menu_principal(){
    porro();
   }

   // Pide al usuario intro numeros, muestra el producto de sus digitos. Finaliza cuando la suma de sus digitos sea 4.

   public static void porro(){
    boolean continuar = false;
    int num = 0;
    int suma = 0;
    int prod = 1;
    int copia = 0;
    int digito = 0;
    String resultado = "";
    while(continuar==false){
        num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
        copia = num;
        suma = 0;
        prod = 1;
        // obtenemos la suma
        while(num>0){
            digito = num%10;
            num = num /10;
            suma = suma+digito;
            prod = prod*digito;
        }

        // comprobamos si cumple la condición de salir
        if(suma==4){
            continuar=true;
        }else{
            resultado = resultado + "El resultado del producto del número [ "+copia+" ] es [ "+ prod+" ]"+'\n';
        }//end_if
    }//end_while
    JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
   }
}
