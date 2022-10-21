package calculadora;

public class calculadora2_0 {

	public static void main(String[] args) {
		String resultado = "";
		int seguir = 0;
		while(seguir != 16) {
			resultado = libreriaCalculadora.menuInicial(resultado);
		}
		
		System.out.println(resultado);
	}

}
