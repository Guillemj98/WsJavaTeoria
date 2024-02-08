package _02_bucles;

import java.util.Iterator;

public class _01_FOR_01 {
	
	// Existen otro tipos de sentencias de control que sirven
	// para alterar el flujo normal de ejecución de un programa.
	// Que son los bucles o sentencias repetitivas.
	
	// Con la sentencia for podemos repetir un bloque de codigo de 
	// 1 a N veces

	public static void main(String[] args) {
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");		
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		
		// Paara hacer repeticiones mejor usar un bucle, en este caso vamos a 
		// hacerlos con el bucle "for"
		// Para hacer un bucle "for" usaremos la palabra reservada "FOR"
		// Dentro de la estructura "FOR" podemos encontrar las siguientes partes
		// 1- Inicio de la variable de control de bucle, normalmente una variable entera on INT
		// 2- Condicion de ejecucion de bucle, cuando se tiene que seguir ejecutando el bucle
		// es una expresión boolean
		// 3- Incremento de la variable de control de bucle
		// Estas 3 partes van entre parentesis y separadas por 
		// por puntos y comas
		System.out.println("--------------------------------------------FOR----------------------------------------");
		for(int i = 1; i <= 10; i++) 			
			System.out.println("Hola en este tema vamos a hablar de bucles");
		
		// Es habitual usar bloques para que ejecute todas las sentencias
		System.out.println("--------------------------------------------FOR CON BLOQUE----------------------------------------");
		for(int i = 1; i <= 10; i++) {			
			System.out.println("Hola en este tema vamos a hablar de bucles");
			System.out.println("Esta es otra frase");
		}
		System.out.println("--------------------------------------------FOR USANDO LA VARIABLE DE CONTROL----------------------------------------");
		for(int i = 1; i <= 10; i++) {			
			System.out.println("Hola ESTE BUCLE LO HEMOS EJECUTADO " + i );
	
		}
		// Cuando salgamos del bucle la variable de control que hayamos creado
		// morirá.
		
		// Como imprimir los numero pares
		System.out.println("--------------------------------------------FOR IMPRIMIENDO LOS PARES----------------------------------------");
		for(int i = 0; i <= 10; i +=2) {			
			System.out.println("Hola ESTE BUCLE LO HEMOS EJECUTADO " + i );
			// i++;// NO es buena practica alterar la variable de control de bucle
			// fuera del "FOR"
	
		}
		// Normalmente usamos la palabra iteración para referimos a cada
		// salto del bucle
		
		// TODAS las partes del for son OPTATIVAS	
		//for (;;) {
			// OJOOOOOOO cuidado con bules que no paran porque podemos hacer 
			// un bucle infinito
			//System.out.println("ESto es un bucle infinito");
		
		// A veces hacemos bucle infinitos por error o que no entre en un 
		// bucle por erro de programación, se va a parar al maximo rango del int
		//for(int i = 101; i > 100; i +=1) {			
			//System.out.println("ESTO se imprime nuchas veces " + i );
		//}
		
		
		// Recomendaciones 
		// 1- Escribir la varible de control y ver como se va incrementando
		// respecto al tiempo		
		// 2- Siempre hacer bloques, aunque sea solo sea una sentencia
		
		// Podemos declarar la variable de control de bucle fuera del bucle
		
		int i = 0;
		for(i = 0; i <= 100; i +=2) {			
			System.out.println("ESTO se imprime nuchas veces " + i );
		}
		System.out.println("Ahora si que puedo acceder la variale de control: " + i);
		
		// Usando bucles podemos resolver de varias maneras los ejercicios,
		// Jugando con la variable de control y las condiciones de ejecución
		for (int j = 0; j <= 9;j ++) {
			System.out.println("Esto se imprime: " + j);
		}
		for (int j = 1; j <= 10;j ++) {
			System.out.println("Esto se imprime: " + j);
		}
		// Va a ser igual las 2 anteriores las 2 imprimen 10 veces 
		
		int numero = 10;
		for (int j = 1; j <= numero; j++) {
			System.out.println("Hola 10 veces");
		}
		
	
		// Podemos invocar funciones dentro de un bucle
		for (int j = 1; j <= numero; j ++) {
			imprimerNumero(j);
		}
		
		// De igual manera podemos invocar funciones que hagan bucles for
		imprimirXVecesNumero(10);
	}
	public static void imprimerNumero (int numero) {
		System.out.println("El numero es : " + numero);
	}
	public static void imprimirXVecesNumero(int numero) {
		for (int j = 1; j <= numero; j ++) {
			imprimerNumero(j);
		}
	}

}
