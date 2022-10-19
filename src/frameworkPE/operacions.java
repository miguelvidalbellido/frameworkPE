package frameworkPE;

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
	/*							OBTENER LA MEDIA DOS NÚMEROS				ESTA MAL		*/
	public static float mediaDosNums(int n1, int n2){
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
	/*							OBTENER LA MEDIA VARIOS NUMS						*/
	public static float media(int n1, int n2){//n1 es la suma de los nums, n2 es la cantidad entre la cual dividir
		float resultado = 0;
		if(n1!=0){
			resultado = n1/n2;
		}else {
			resultado = 0;
		}
		return resultado;
	}

	/*								INT			 						*/
	/*						CONVERTIR STRING EN INT						*/
	public static int stringToInt(String cadena){
		int num = 0;
		num=Integer.parseInt(cadena);
		return num;
	}
	
	
}
