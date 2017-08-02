package suma;

public class Suma {

	public static void main(String[] args) {
		
	
	int num1=2;
	int num2=4;
	sumarNumero(num1, num2);
		
	}
	
	/**
	 * Esta funcion se encarga de sumar los numeros que se le pasan por parametro
	 * 
	 * @param num1	Variable uno 
	 * @param num2	Variable dos
	 * 
	 * @return Devuelve el resultado de la suma 
	 */
	private static int sumarNumero(int num1, int num2) {
		return (num1 + num2);		
	}

}
