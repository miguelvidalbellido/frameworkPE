package frameworkPE;
import frameworkPE.*;
import javax.swing.JOptionPane;

public class nnumeros {
    
    /* N NÚMEROS */
	// contadores
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
	    
	    // cont digitos
	    public static void contadorDigitos() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        System.out.println(n);
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.cantidadDigitos(num);
		            resultado = resultado + "El número "+num+" tiene "+cant_digitos+" digitos."+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }
    
    
	// contador pares
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
	    
	    // cont digitos pares
	    public static void contadorDigitosPares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        System.out.println(n);
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.cantidadDigitosPares(num);
		            resultado = resultado + "El número "+num+" tiene "+cant_digitos+" digitos pares."+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }
	
	// contador impares
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
	    
	    // cont digitos impares
	    public static void contadorDigitosImpares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        System.out.println(n);
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.cantidadDigitosImpares(num);
		            resultado = resultado + "El número "+num+" tiene "+cant_digitos+" digitos impares."+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }
	// sumar 
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
	    
	    // suma digitos
	    public static void sumaDigitos() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        System.out.println(n);
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.sumaDigitos(num);
		            resultado = resultado + "La suma de los dígitos del número "+num+" es "+cant_digitos+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// sumar pares
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

		// suma digitos pares
		public static void sumaDigitosPares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        System.out.println(n);
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.sumaDigitosPares(num);
		            resultado = resultado + "La suma de los dígitos pares del número "+num+" es "+cant_digitos+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// suma impares
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

		// suma digitos impares
		public static void sumaDigitosImpares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        System.out.println(n);
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.sumaDigitosImpares(num);
		            resultado = resultado + "La suma de los dígitos impares del número "+num+" es "+cant_digitos+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// producto
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

		// producto de digitos
		public static void productoDigitos() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.productoDigitos(num);
		            resultado = resultado + "El producto de los dígitos del número "+num+" es "+cant_digitos+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// producto pares
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

		// producto de digitos pares
		public static void productoDigitosPares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.productoDigitosPares(num);
		            resultado = resultado + "El producto de los dígitos pares del número "+num+" es "+cant_digitos+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// producto impares
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

		// producto de digitos impares
		public static void productoDigitosImpares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        int cant_digitos = 0;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        for(int i=1;i<=n;i++){
		            cant_digitos = 0;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            cant_digitos = digitos.productoDigitosImpares(num);
		            resultado = resultado + "El producto de los dígitos impares del número "+num+" es "+cant_digitos+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// media
		// media de los divisores
		public static void mediaDivisores(){
			int n = 0;
			int num = 0;
			String resultado = "";
			float media = 0.0f;
			n = validar.solicitarNumArgumentos("Introduce n","[INT]");
			for(int i=1;i<=n;i++){
				media = 0.0f;
				num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
				media = divisores.mediaDivisores(num);
				resultado = resultado + "La media de los divisores del número "+num+" es "+media+'\n';
			}
			JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}

		// media de los digitos
		public static void mediaDigitos() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        float a_pintar = 0.0f;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        for(int i=1;i<=n;i++){
		            a_pintar = 0.0f;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            a_pintar = digitos.mediaDigitos(num);
		            resultado = resultado + "La media de los dígitos del número "+num+" es "+a_pintar+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// media pares
		// media de los divisores pares
		public static void mediaDivisoresPares(){
			int n = 0;
			int num = 0;
			String resultado = "";
			float media = 0.0f;
			n = validar.solicitarNumArgumentos("Introduce n","[INT]");
			for(int i=1;i<=n;i++){
				media = 0.0f;
				num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
				media = divisores.mediaDivisoresPares(num);
				resultado = resultado + "La media de los divisores pares del número "+num+" es "+media+'\n';
			}
			JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}

		// media de los digitos pares
		public static void mediaDigitosPares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        float a_pintar = 0.0f;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        for(int i=1;i<=n;i++){
		            a_pintar = 0.0f;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            a_pintar = digitos.mediaDigitosPares(num);
		            resultado = resultado + "La media de los dígitos pares del número "+num+" es "+a_pintar+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }

	// media impares
		// media de los divisores impares
		public static void mediaDivisoresImpares(){
			int n = 0;
			int num = 0;
			String resultado = "";
			float media = 0.0f;
			n = validar.solicitarNumArgumentos("Introduce n","[INT]");
			for(int i=1;i<=n;i++){
				media = 0.0f;
				num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
				media = divisores.mediaDivisoresImpares(num);
				resultado = resultado + "La media de los divisores impares del número "+num+" es "+media+'\n';
			}
			JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}

		// media de los digitos impares
		public static void mediaDigitosImpares() {
	    	 int n = 0;
		        int num = 0;
		        String resultado = "";
		        float a_pintar = 0.0f;
		        n = validar.solicitarNumArgumentos("Introduce n","[INT]");
		        for(int i=1;i<=n;i++){
		            a_pintar = 0.0f;
		            num = validar.solicitarNumArgumentos("Introduce un número","[INT]");
		            a_pintar = digitos.mediaDigitosImpares(num);
		            resultado = resultado + "La media de los dígitos impares del número "+num+" es "+a_pintar+'\n';
		        }
		        JOptionPane.showMessageDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	    }
}
