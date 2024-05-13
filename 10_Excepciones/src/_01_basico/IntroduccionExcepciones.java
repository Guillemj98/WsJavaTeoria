package _01_basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntroduccionExcepciones {

	/*
	 * Las excepciones en java son situaciones que pueden provocar 
	 * un fallo en el programa.
	 * 
	 * Cuando se lanza una excepcion en Java y no se controla, se para
	 * automaticamente el programa 
	 */
	public static void main(String[] args) {
		String s = null;
		//s.charAt(0); // Excepcion, concretamente NullPointerException;
		
		// La opcion que tenemos en Java para controlar las excepciones
		// es mediante los bloques llamados "try -catch".
		
		// En la parte try ponemos el codigo el cual queremos capturar posibles
		// excepciones
		
		// En la parte catch ponemos el codigo que queremos ejecutar en caso de 
		// que ocurra alguna excepcion, y por lo tanto No se parará el programa.
		// Es obligatorio en la parte catch el tipo de excepción que queremos
		// capturar.
		
		// El programa continuara con su ejecución de manera normal cuadno sala
		// del bloque "try-catch"
		
		try {
			s.charAt(0);
		} catch (NullPointerException npe) {
			// Aqui ejecutamos la sentencias que queramos.
			System.out.println("oJo "+ "s"+" esta apuntando a Null");
			
		}
		System.out.println("Continuamos para BINGO");
		
		// OJOOo esto no arregla el problema, esto lo unico que hace es 
		// evitar que el programa se pare.
		
		// Este codigo de aqui si el usuario introduce trece en vez de 13
		// el programa se parara porque ocurre java.util.InputMismatchException.
		// Y no puede decirle al usuario de que lo ha hecho mal
		/*
		System.out.println("Introduzca un numero:");
		Scanner sc = new Scanner(System.in);
		Integer n1 = sc.nextInt();
		System.out.println("El numero introducido es " + n1);
		*/
		
		// Usamos un bloque TRY-CATCH para evitar que le programa se pare
		/*try {
			Scanner sc = new Scanner(System.in);
			Integer n1 = sc.nextInt();
			System.out.println("El numero introducido es " + n1);
		} catch (InputMismatchException ime) {
			System.out.println("Eres malisimo el numero no es escrito ");
		}
		*/
		// OJO esto no arregla el programa pero al menos me da la opcion 
		// de arreglarlo.
		boolean numeroCorrecto = false;
		do {
			try {
				System.out.println("Introduce el numero");
				Scanner sc = new Scanner(System.in);
				Integer n1 = sc.nextInt();// Aqui se lanzaria la excepcion
				
				System.out.println("El numero introducido es " + n1);
				// Si llegamos a esta linea no se lanza la excepcion
				numeroCorrecto = true;
			} catch (InputMismatchException ime) {
				System.out.println("Eres malisimo el numero no es escrito ");
			}
		}while(!numeroCorrecto);
		
		// En esta ultima parte hemos usado los bloques TRY-CATCH para ayudarnos 
		// a controlar las excepciones y poder aplicar logica para solucionarlos
		
		// Muchas veces podemos conmtrolar las excepciones coon if lo que suele ser
		// a nivel de codigo mas optimo
		String s2 = null;
		s2.charAt(0);
		if(s2 !=null) {
			s2.charAt(0);
		}

	}

}
