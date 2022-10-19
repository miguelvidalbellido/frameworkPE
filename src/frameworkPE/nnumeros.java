package frameworkPE;
import frameworkPE.*;
import javax.swing.JOptionPane;

public class nnumeros {
    
    /* N NÚMEROS */
    // cont divisores
    public static void contadorDivisores(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int cant_divisores = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        System.out.println(n);
        for(int i=1;i<=n;i++){
            cant_divisores = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            cant_divisores = divisores.numeroDeDivisores(num);
            resultado = resultado + "El número "+num+" tiene "+cant_divisores+" divisores."+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // cont divisores pares
    public static void contadorDivisoresPares(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int cant_divisores = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        System.out.println(n);
        for(int i=1;i<=n;i++){
            cant_divisores = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            cant_divisores = divisores.numeroDeDivisoresPares(num);
            resultado = resultado + "El número "+num+" tiene "+cant_divisores+" divisores."+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // cont divisores impares
    public static void contadorDivisoresImpares(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int cant_divisores = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        System.out.println(n);
        for(int i=1;i<=n;i++){
            cant_divisores = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            cant_divisores = divisores.numeroDeDivisoresImpares(num);
            resultado = resultado + "El número "+num+" tiene "+cant_divisores+" divisores."+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // suma divisores
    public static void sumaDivisores(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int suma = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        System.out.println(n);
        for(int i=1;i<=n;i++){
            suma = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            suma = divisores.sumaDeDivisores(num);
            resultado = resultado + "La suma de los dívisores del número "+num+" es "+suma+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // suma divisores pares 
    public static void sumaDivisoresPares(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int suma = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        System.out.println(n);
        for(int i=1;i<=n;i++){
            suma = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            suma = divisores.sumaDeDivisoresPares(num);
            resultado = resultado + "La suma de los dívisores pares del número "+num+" es "+suma+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // suma divisores impares
    public static void sumaDivisoresImpares(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int suma = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        System.out.println(n);
        for(int i=1;i<=n;i++){
            suma = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            suma = divisores.sumaDeDivisoresImpares(num);
            resultado = resultado + "La suma de los dívisores impares del número "+num+" es "+suma+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // producto de divisores
    public static void productoDivisores(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int producto = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        for(int i=1;i<=n;i++){
            producto = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            producto = divisores.productoDeDivisores(num);
            resultado = resultado + "El producto de los dívisores del número "+num+" es "+producto+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // producto de divisores pares
    public static void productoDivisoresPares(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int producto = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        for(int i=1;i<=n;i++){
            producto = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            producto = divisores.productoDeDivisoresPares(num);
            resultado = resultado + "El producto de los dívisores pares del número "+num+" es "+producto+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // producto de divisores impares
    public static void productoDivisoresImpares(){
        int n = 0;
        int num = 0;
        String resultado = "";
        int producto = 0;
        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
        for(int i=1;i<=n;i++){
            producto = 0;
            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
            producto = divisores.productoDeDivisoresImpares(num);
            resultado = resultado + "El producto de los dívisores impares del número "+num+" es "+producto+'\n';
        }
        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    // divisor mayor 

    // divisor menor 

    // divisor mayor y menor

    // media de los divisores

    // media de los divisores pares

    // media de los divisores impares

}
