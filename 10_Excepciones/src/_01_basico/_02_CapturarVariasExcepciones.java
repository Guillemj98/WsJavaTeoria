package _01_basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_CapturarVariasExcepciones {
	public static void main(String[] args) {
		// Vamos a hacer un programa que pida 2 numeros por pantalla
		// y devuelva su division entera
		
		// Aunque este programa es sencillo esta sometido a muchos errores
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = sc.nextInt();
		int resultado = n1 / n2;
		System.out.println(resultado);
		*/
		
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
			
			} catch (InputMismatchException imen) {
				System.out.println("HA introducido una cadena en vez de un numero");
			
			}catch(ArithmeticException ate) {
				// Podemos tener ttamtos bloques catch como queramos y en cada 
				// bloque capturar el tipo de excepciones que necesitemos
				System.out.println("No aceptamos diviosiones por 0");
			}
		}while(!estaCorrecto);
	}

}
