package _02_herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_ClaseException {
	// Aunque la clase padre de todas las clases sea la clase Object
	// Para las excepciones se considera la clase exception
	// Todas las clases que hemos trabajado :
	// NullPOinterException
	// ArrayIndexOfBoundException
	// Todas esta excepciones tiene como padre la clase Exception
	
	// con ests queremos decir que con una referencia de la clase Exception
	// podemos apuntar a cualquier excepcion
	// Esto nos puede servir para agrupar excepciones.
	
	// Vamos a usar el codigo del ejemplo anterior
	public static void main(String[] args) {
		boolean estaCorrecto = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce el primer numero");
				int n1 = sc.nextInt();
				System.out.println("Introduce el segundo numero");
				int n2 = sc.nextInt();
				int resultado = n1 / n2;
				System.out.println(resultado);
				estaCorrecto = true;
			
			} catch (Exception e) {
				// Si usamos la clase exception al ser la clase padre
				// cualquier excepcion que ocurra la controlaremos
				System.out.println("HA ocurrido algun error");
			
			}
		}while(!estaCorrecto);
	}
	
}


