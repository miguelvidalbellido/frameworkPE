# frameworkPE
FrameworkPE, examen primer trimestre programación
![image](https://user-images.githubusercontent.com/46724295/196243539-40b130b2-6899-49a7-8d43-33318d469e92.png)

- Los ejercicios se almacenan en exers.java en funciones:
    public static void *NOMBRE_EJERCICIO*(){
        EJERCICIO RESUELTO
    }

- Se ejecutarán los ejercicios en main.java:
    String[] argumentos --> contendrá los nombres de los ejercicios que estan en exers.java
    op = Solicitamos que introduzca la opción que desea el usuario;
    switch(op){
        case 0:
            exers.NombreEjercicio();
            break;
    }

- Los ejercicios se probarán en test.java.
    Será un archivo temporal para testear el correcto funcionamiento del código, antes de introducirlo como función ej exers.java

[ CONTENIDO DE VALIDAR ]
    - solicitarNum() --> Solicita un número al usuario sin argumentos
    - solicitarNumArgumentos(String mensaje, String titulo) --> Solicita un número al usuario, le tenemos que pasar mensaje y argumento a mostar
    - solicitarChar() --> Solicita un carácter al usuario sin argumentos
    - solicitarCharArgumentos(String mensaje, String titulo) --> Solicita un carácter al usuario, le tenemos que pasar mensaje y argumento a mostrar
    - solicitarFloat() {FALTA}
    - solicitarFloatArgumentos(String mensaje, String titulo) {FALTA}

[ CONTENIDO DE OPERACIONS ]

[ CONTENIDO DE MENUS ]
    - deseaContinuar(String mensaje) --> {int} Solicita al usuario que indique si quiere continuar o no
    - deseaContinuarBoolean(String mensaje) --> {boolean} Solicita al usuario que indique si quiere continuar o no 
    - menuBotons(String[] opciones, String titulo, String mensaje) --> {int} Solicita al usuario que indique una opción a realizar
    - whileInterruptor() {REFACTORIZAR} --> Bucle del interruptor para refactorizar
    - nNumeros() {REFACTORIZAR} --> Bucle solicitar n para refactorizar
    - cincoPrimerosNums() {REFACTORIZAR} --> Bucle que se repite 5 veces para refactorizar
    - obtenerDigitios() {REFACTORIZAR} --> Solicita num y obtiene digitos para refactorizar
    - obtenerDivisores() {REFACTORIZAR} --> Solicita num y obtiene los divisores para refactorizar
    - menorYmayor() {REFACTORIZAR} --> Solicita un número y obtiene el menor y mayor con pivot para refactorizar
