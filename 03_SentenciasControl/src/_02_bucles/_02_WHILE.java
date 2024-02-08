package _02_bucles;

import java.util.Scanner;

public class _02_WHILE {

	public static void main(String[] args) {
		
		// Los bucles FOR están pensados principalmente para realizar un numero determinado 
		// de saltos. Ej 1 a 30, de 30 a 1, etc
		// Tenemos otro tipos de bucles que están mas pensados para
		// hacer un numero indeterminado de saltos
		// es decir que no estamos muy seguros del numero de iteraciones
		// que vamos a realizar.
		
		// Para este tipo de bucles usamos el llamado bucle "while"
		// Este tipo de bucle es una mezcla entre un " FOR y un IF"
		
		// Para usar este tipo de bucles usaremos la siguiente sentencias
		// while(EXPRESIÓN_BOOLEAN)
		
		// El while se ejecutara siempre y cuando la expresión boolean
		// de dentro de los parentesis sea TRUE
		
		// OJOOO este tipo de bucles es mucho mas fácil hacer bucles 
		// infinitos
		
		// El ejemplo ma fácil sería un blucle infinito
		/*
		while(true)
			System.out.println("Esto es un bucle infinito");
		 */
		
		// Normalmente pondremos bloque dentro del while
		// y debemos de concluir el bucle en algún momento
		
		// Imprimir los 10 primers numeros mediante un bucle WHILE
		int numero = 1;
		while(numero <=10) {
			System.out.println( numero++ );			
		}
		
		// Todo algoritmo tiene su equivalente de For a While 
		// (incluso a la inversa aunque no sea la habitual
		
		// La filosofía de un bucle while es ejecutar una serie sentencias
		// entre 0 y n veces, es decir, que si no cumple la condición ni una sola
		// vez no entraría en el bucle
		
		numero = 11;
		while(numero <=10) {
			System.out.println( "Esto no se ejecuta ni una sola vez" );			
		}
		
		// Lo mas habitual es usar un while cuando no sabemos el numero de 
		// iteraciones que vamos a realizar
		
		// Vamos a pedirle un numero al usuario hasta que este emtre los valores
		// 1 y 10
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entre el 1 y el 10");
		numero = sc.nextInt();
		while(numero <1 || numero >10) {
			System.out.println("El numero es incorrecto");
			System.out.println("Introduzca un numero entre el 1 y el 10");
			numero = sc.nextInt();
		}
		System.out.println("EL numero esta entre 1 y 10");
		
		
		
		
		// MANERA BOOLEANA CON UNA VARIABLE BOOLEANA QUE HACE EFECTO DE "FLAG"
		boolean correcto = false;// Esta varaible hace efecto de Bandera o Flag
								// Es decir va a hacer que se siga ejecutando el bucle 
								// while o no
								// en este caso parto de la base en que le usuario va introducir
								// mal los datos, por lo tanto establezco correcto = false.
		while(!correcto) {
			System.out.println("Introduzca un numero entre el 1 y el 10");
			numero = sc.nextInt();
			if (numero <=10 && numero >=1) {
			System.out.println("EL numero esta entre 1 y 10");
			correcto = true;
			}else {
				System.out.println("El numero es incorrecto");
			}
		}
		
		
		
	}

}
