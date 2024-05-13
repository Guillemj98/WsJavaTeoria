package _03_metodos;

import java.util.Scanner;

public class _01_MetodosYExcepciones {
	public static void main(String[] args)  {
		System.out.println("Introduzca un numero");
		// Cuando usamos un metodo que arroja excepciones de tipo
		// que arroja de tipo Exception se llaman excepciones checked
		// y tenemos que poner un bloque try-catch obligatoriamente.
		int numero = 0;
		try {
			numero = recogerNumeroExcepcion();
		} catch (Exception e) {
			//Este bloque ha sido generado automaticamente con Eclipse
			// y te invoca automaticamente al metodo e.printStackTrace
			e.printStackTrace();// Esto usa la saldida system.out.err
		}
		System.out.println("El numero es: " + numero);
		
		// Invocamos a la otra funcion
		// Las excpciones de tipo RuntimeException son excepciones
		// que se llaman unchecked esto quiere decir que NO tenemos
		// porque capturar las excepciones con un bloque try-catch
		// aunque muchas veces tengamos que hacerlas igualmente
		System.out.println("Inroduzca otro numero");
		int numero2 = recogerNumeroRunnable();
		// Hay que tener claro que en Java si ocurre una excepcion 
		// y no usamos el bloque try-catch el programa se parara
		// Por ejemplo en la linea 27 como no hemos capturado el 
		// el error, si ocurre se nos parara el programa
		
		// Las excepciones unchecked tambien podemos controlarlas con bloques
		// try-catch usando la opcion de eclipse surrounded with y despues
		// try-catch
		try {
			int numero3 = recogerNumeroRunnable();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Nos podriamos preguntar cuando arrojar excepciones checked o 
		// unchecked. Con checked es cuando queremos mucha importancia
		// a la excepcion y queremos obligar al programador a poner un 
		// bloque try-catch. 
		// Con unchecked no queremos darle tanta importancia a la excepcion
		// y no hace falta poner un  bloque try-catch
	
		
	}
	
	// Hay veces que nos interesa avisar a quien llame a este metodo
	// de que ha habido una excepcion. Para ello podemos usar la palabra
	// reservada Throws al final del método y acontinuacion el tipo de 
	// excepcion que queremos devolver. En este caso usaremos la clase
	// Exception para arrojar cualquier excepcion. De hecho se debe
	// documentar.
	
	
	
	// Es poible que ademas de arrojar la excepcion queramos capturarla
	// para tratarla en ese momento y ademas arrojarla hacia arriba
	// En este ejemplo vamos a capturar la excepcion y a arrojarla.
	
	/**
	 * Recoger un numero pasado por consola
	 * @return numero recogido
	 * @throws Exception si el valor introducido no es numero entero.
	 */
	public static int recogerNumeroExcepcion() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		return numero;
	}
	public static int recogerNumeroRunnable()throws RuntimeException  {
		Scanner sc = new Scanner(System.in);
		int numero;
		try {
			numero = sc.nextInt();
			return numero;
		} catch (Exception e) {
			System.out.println("Valor incorreecto");
			// Para arrojar un error podemos usar la palabra
			// throw
			
			throw e;
			
		}finally {
			// Este bloque se ejecuta siempre sin importar si ha entrado 
			// o no por el catch
			System.out.println("Esto siempre se ejecuta halla o no error");
		}
	
	}

}
