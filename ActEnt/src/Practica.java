import java.io.*;

public class Practica {
	/**
	 * @version 1.0
	 * @autor Isabel
	 * @param Método para imprimir resultado
	 * @return Devuelve un número float para la variable fAltura
	 * El método que usamos sirve para imprimir el resultado
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String cadenaLeida;
		
		//Declaracioón de variables
		short shDorsal;
		float fPeso, fAltura;
		
		// 1) Pido dorsal

		shDorsal = PedirDorsal(teclado);
		
		
		// 2) Pido peso

		fPeso = PedirPeso(teclado);
		
		
		// 3) Pido altura

		fAltura = PedirAltura(teclado);
		
		// 4) Imprimir el resultado

		imprimirResultado(shDorsal, fPeso, fAltura);
		
	}
	
	/**
	 * @version 1.0
	 * @autor Isabel
	 * @param Método para imprimir resultado
	 * @return Devuelve un número float para la variable fAltura
	 * El método que usamos sirve para imprimir el resultado
	 */
	public static void imprimirResultado(short shDorsal, float fPeso, float fAltura) {

		System.out.println("El dorsal numero "+shDorsal+" mide "+fAltura+" y pesa "+fPeso);
	}
	/**
	 * @version 1.0
	 * @autor Isabel
	 * @param Método para pedir el peso
	 * @return Devuelve un número float para la variable fPeso
	 * El método que usamos sirve para pedir por teclado el peso al usuario
	 */
	public static float PedirPeso(BufferedReader teclado) {
		String cadenaLeida;
		float fPeso;
		System.out.println("Introduce el peso (40....150): ");
		try {
			cadenaLeida = teclado.readLine();
		}catch(Exception e) {
			cadenaLeida = "";
		}
				
		//Conversion String --> short
		fPeso = Float.parseFloat(cadenaLeida);
		return fPeso;
	}
	/**
	 * @version 1.0
	 * @autor Isabel
	 * @param Método para pedir la altura
	 * @return Devuelve un número float para la variable fAltura
	 * El método que usamos sirve para pedir por teclado la altura al usuario
	 */
	public static float PedirAltura(BufferedReader teclado) {
		String cadenaLeida;
		float fAltura;
		System.out.println("Introduce el peso (1.40...2.10): ");
		try {
			cadenaLeida = teclado.readLine();
		}catch(Exception e) {
			cadenaLeida = "";
		}
				
		//Conversion String --> short
		fAltura = Float.parseFloat(cadenaLeida);
		return fAltura;
	}
	/**
	 * @version 1.0
	 * @autor Isabel
	 * @param Método para pedir la dorsal
	 * @return Devuelve un número short para la variable shDorsal
	 * El método que usamos sirve para pedir por teclado el dorsal al usuario
	 */
	public static short PedirDorsal(BufferedReader teclado) {
		String cadenaLeida;
		short shDorsal;
		System.out.println("Introduce el dorsal (1....9999): ");
		try {
			cadenaLeida = teclado.readLine();
		}catch(Exception e) {
			cadenaLeida = "";
		}
		
		//Conversion String --> short
		shDorsal = Short.parseShort(cadenaLeida);
		return shDorsal;
	}

}
