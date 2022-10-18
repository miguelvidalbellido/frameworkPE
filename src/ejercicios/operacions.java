package ejercicios;

public class operacions {
    /*								INT			 						*/
	/*							SUMAR DOS NÚMEROS						*/
	public static int sumar(int n1, int n2){
		int suma = 0;
		suma = n1 + n2;
		return suma;
	}

	/*								INT			 						*/
	/*							RESTAR DOS NÚMEROS						*/
	public static int restar(int n1, int n2){
		int resta = 0;
		if(n1<n2) {
			resta = 00;
		}else {
		resta = n1 - n2;
		}//end_if
		return resta;
	}

	/*								INT			 						*/
	/*							DIVIDIR DOS NÚMEROS						*/
	public static int dividir(int n1, int n2){
		int division = 0;
		division = n1/n2;
		return division;
	}

	/*								INT			 						*/
	/*						MULTIPLCIAR DOS NÚMEROS						*/
	public static int multiplicar(int n1, int n2){
		int multiplicacion = 0;
		multiplicacion = n1*n2;
		return multiplicacion;
	}

	/*								INT			 						*/
	/*							OBTENER LA MEDIA						*/
	public static float media(int n1, int n2){
		float average = 0.0f;
		int suma = 0;
		if(suma!=0){
			average = suma/2;
		}else {
			average = 0;
		}
		return average;
	}

	/*								INT			 						*/
	/*						CONVERTIR STRING EN INT						*/
	public static int stringToInt(String cadena){
		int num = 0;
		num=Integer.parseInt(cadena);
		return num;
	}
	
	/*								INT			 						*/
	/*					WHILE INTERRUTOR REFACTORIZAR					*/
	/*public static void whileInterruptor(){
		boolean interruptor = false;
		while(interruptor==false){
			if(CONDICIÓN PARA SALIR){
				interruptor = true;
			}else{
				OPERACIÓNES A REALIZAR
			}
		}//end_while
	}/*
	
	/*								INT			 						*/
	/*					FOR N NÚMEROS REFACTORIZAR						*/
	/*public static void nNumeros(){
		int n = 0;
		n = validar.solicitarNum();
		for(int i=1;i<=n;i++){
			
			 OPERACIÓNES A REALIZAR 
		}//end_for
	}/*

	/*								INT			 						*/
	/*					FOR 5 PRIMEROS REFACTORIZAR						*/
	/*public static void nNumeros(){
		for(int i=1;i<=5;i++){
			OPERACIÓNES A REALIZAR 
		}//end_for
	}/*

	/*								INT			 						*/
	/*						DÍGITOS REFACTORIZAR						*/
	public static void obtenerDigitos(){
		/*int copia = 0;
		int num = 0;
		int digito = 0;
		num = validar.solicitarNum();
		copia = num;
		while(num>0){
			digito = num%10;
			num = num/10;
			//System.out.println(digito);
		}*/
	}

	/*								INT			 						*/
	/*						DIVISORES REFACTORIZAR						*/
	public static void obtenerDivisores(){
		/*int divisor = 0;
		int num = 0;
		num = validar.solicitarNum();
		for(int i=1;i<=num;i++) {
			divisor = 0;
			if(num%i==0) {
				divisor = i;
				System.out.println(divisor);
			}
		}*/
	}

	/*								INT			 						*/
	/*						MENOR Y MAYOR REFACTORIZAR					*/
	public static void menorYmayor(){
		/*
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
		*/
	}
	
	
}
